package problem.code.convention.dependency;

import com.google.gson.Gson;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.Collator;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Pattern;

public class StringUtil {
    public static final String CHARFORM_NOHORN = "aaaaaaaaaaaaaaaaaaeeeeeeeeeeeiiiiiooooooooooooooooouuuuuuuuuuuyyyyyd"
            + "AAAAAAAAAAAAAAAAAEEEEEEEEEEEIIIIIOOOOOOOOOOOOOOOOOUUUUUUUUUUUYYYYYD";
    public static final String CHARFORM_UNICODE = "àáảãạâầấẩẫậăằắẳẵặèéẻẽẹêềếểễệìíỉĩịòóỏõọôồốổỗộơờớởỡợùúủũụưừứửữựỳýỷỹỵđ"
            + "ÀÁẢÃẠÂẦẤẨẪẬĂẰẮẲẴẶÈÉẺẼẸÊỀẾỂỄỆÌÍỈĨỊÒÓỎÕỌÔỒỐỔỖỘƠỜỚỞỠỢÙÚỦŨỤƯỪỨỬỮỰỲÝỶỸỴĐ";
    public static final String CHARFORM_TCVN = "µ¸¶·¹©ÇÊÈÉË¨»¾¼½ÆÌ�?Î�?ÑªÒÕÓÔÖ×�?ØÜÞßãáâä«åèæçé¬êíëìîïóñòô­õøö÷ùúýûüþ®"
            + "µ¸¶·¹©ÇÊÈÉË¨»¾¼½ÆÌ�?Î�?ÑªÒÕÓÔÖ×�?ØÜÞßãáâä«åèæçé¬êíëìîïóñòô­õøö÷ùúýûüþ®";
    public static final int ALIGN_CENTER = 0;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;

    private static final String ALGORITHM = "md5";
    private static final String DIGEST_STRING = "HG58YZ3CR9";
    private static final String CHARSET_UTF_8 = "utf-8";
    private static final String SECRET_KEY_ALGORITHM = "DESede";
    private static final String TRANSFORMATION_PADDING = "DESede/CBC/PKCS5Padding";
    private static char[] SYMBOLS = "!@#$%&".toCharArray();
    private static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static char[] NUMBERS = "0123456789".toCharArray();
    private static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
    private static Random rand = new SecureRandom();


    public static String format(long lngNumber, String strPattern) {
        DecimalFormat fmt = new DecimalFormat(strPattern);
        return fmt.format(lngNumber);
    }

    public static String format(double dblNumber, String strPattern) {
        DecimalFormat fmt = new DecimalFormat(strPattern);
        return fmt.format(dblNumber);
    }

    public static String replaceAll(String strSrc, String strFind, String strReplace) {
        if (strFind == null || strFind.length() == 0)
            return strSrc;
        int iLocation = 0;
        int iPrevLocation = 0;
        StringBuffer strResult = new StringBuffer();
        while ((iLocation = strSrc.indexOf(strFind, iLocation)) >= 0) {
            strResult.append(strSrc.substring(iPrevLocation, iLocation));
            strResult.append(strReplace);
            iLocation += strFind.length();
            iPrevLocation = iLocation;
        }
        strResult.append(strSrc.substring(iPrevLocation, strSrc.length()));
        return strResult.toString();
    }

    public static String replaceAll(String strSrc, String strFind, String strReplace, int iMaxReplacement) {
        int iLocation = 0;
        if (strFind == null || strFind.length() == 0)
            return strSrc;
        int iPrevLocation = 0;
        int iCount = 0;
        StringBuffer strResult = new StringBuffer();
        while ((iLocation = strSrc.indexOf(strFind, iLocation)) >= 0 && iCount < iMaxReplacement) {
            strResult.append(strSrc.substring(iPrevLocation, iLocation));
            strResult.append(strReplace);
            iCount++;
            iLocation += strFind.length();
            iPrevLocation = iLocation;
        }
        strResult.append(strSrc.substring(iPrevLocation, strSrc.length()));
        return strResult.toString();
    }

    public static String replaceAllIgnoreCase(String strSrc, String strFind, String strReplace) {
        if (strFind == null || strFind.length() == 0)
            return strSrc;
        String strSrcUpper = strSrc.toUpperCase();
        strFind = strFind.toUpperCase();

        int iLocation = 0;
        int iPrevLocation = 0;
        StringBuffer strResult = new StringBuffer();
        while ((iLocation = strSrcUpper.indexOf(strFind, iLocation)) >= 0) {
            strResult.append(strSrc.substring(iPrevLocation, iLocation));
            strResult.append(strReplace);
            iLocation += strFind.length();
            iPrevLocation = iLocation;
        }
        strResult.append(strSrc.substring(iPrevLocation, strSrc.length()));
        return strResult.toString();
    }

    public static boolean isEmptyString(String str) {
        if (str == null)
            return true;
        else {
            return str.trim().length() <= 0;
        }
    }

    public static String nvl(Object objInput, String strNullValue) {
        if (objInput == null)
            return strNullValue;
        return objInput.toString();
    }

    public static int indexOfLetter(String strSource, int iOffset) {
        char c;
        while (iOffset < strSource.length()) {
            c = strSource.charAt(iOffset);
            if (c > ' ')
                return iOffset;
            else
                iOffset++;
        }
        return -1;
    }


    public static int indexOfSpace(String strSource, int iOffset) {
        char c;
        while (iOffset < strSource.length()) {
            c = strSource.charAt(iOffset);
            if (c > ' ')
                iOffset++;
            else
                return iOffset;
        }
        return -1;
    }

    public static int countSymbol(String strSource, String chrSymbol, int iOffset) {
        if (chrSymbol == null || chrSymbol.length() == 0)
            return 0;
        int iCount = 0;
        while ((iOffset = strSource.indexOf(chrSymbol, iOffset) + 1) > 0)
            iCount++;
        return iCount;
    }

    public static String[] toStringArray(String strSource, String strSeparator) {
        Vector vtReturn = toStringVector(strSource, strSeparator);
        String[] strReturn = new String[vtReturn.size()];
        for (int iIndex = 0; iIndex < strReturn.length; iIndex++)
            strReturn[iIndex] = (String) vtReturn.elementAt(iIndex);
        return strReturn;
    }

    public static Vector toStringVector(String strSource, String strSeparator) {
        Vector vtReturn = new Vector();
        int iIndex = 0;
        int iLastIndex = 0;
        while ((iIndex = strSource.indexOf(strSeparator, iLastIndex)) >= 0) {
            vtReturn.addElement(strSource.substring(iLastIndex, iIndex).trim());
            iLastIndex = iIndex + strSeparator.length();
        }
        if (iLastIndex <= strSource.length())
            vtReturn.addElement(strSource.substring(iLastIndex, strSource.length()).trim());
        return vtReturn;
    }

    public static String[] toStringArray(String strSource) {
        return toStringArray(strSource, ",");
    }

    public static Vector toStringVector(String strSource) {
        return toStringVector(strSource, ",");
    }

    public static String convertCharForm(String strSource, String strCharformSource, String strCharformDestination) {
        if (strSource == null)
            return null;
        int iLength = strSource.length();
        int iResult = 0;
        StringBuffer strReturn = new StringBuffer();
        for (int iIndex = 0; iIndex < iLength; iIndex++) {
            char c = strSource.charAt(iIndex);
            if ((iResult = strCharformSource.indexOf(c)) >= 0)
                strReturn.append(strCharformDestination.charAt(iResult));
            else
                strReturn.append(c);
        }
        return strReturn.toString();
    }

    public static String unicodeToTCVN(String strSource) {
        return convertCharForm(strSource, CHARFORM_UNICODE, CHARFORM_TCVN);
    }


    public static String tcvnToUnicode(String strSource) {
        return convertCharForm(strSource, CHARFORM_TCVN, CHARFORM_UNICODE);
    }

    public static String clearHornUnicode(String strSource) {
        return convertCharForm(strSource, CHARFORM_UNICODE, CHARFORM_NOHORN);
    }

    public static String clearHornTCVN(String strSource) {
        return convertCharForm(strSource, CHARFORM_TCVN, CHARFORM_NOHORN);
    }

    public static String pronounceVietnameseNumber(long lNumber) {
        String strUnit[] = new String[]{"", "nghìn", "triệu", "tỷ", "nghìn tỷ", "triệu tỷ", "nghìn triệu tỷ",
                "tỷ tỷ"};

        // Analyse the number to array
        byte btDecimalNumber[] = new byte[30];
        byte btDecimalCount = 0;
        boolean bNegative = (lNumber < 0);
        if (bNegative)
            lNumber = -lNumber;
        while (lNumber > 0) {
            byte btValue = (byte) (lNumber - 10 * (lNumber / 10));
            lNumber /= 10;
            btDecimalNumber[btDecimalCount++] = btValue;
        }

        // Pronounce array
        String strReturn = "";
        int iUnitIndex = 0;
        while (iUnitIndex < strUnit.length && iUnitIndex * 3 < btDecimalCount) {
            String str = pronounceVietnameseNumber(btDecimalNumber[iUnitIndex * 3], btDecimalNumber[iUnitIndex * 3 + 1],
                    btDecimalNumber[iUnitIndex * 3 + 2], iUnitIndex * 3 + 2 < btDecimalCount);
            if (str.length() > 0) {
                if (strReturn.length() > 0)
                    strReturn = str + " " + strUnit[iUnitIndex] + " " + strReturn;
                else
                    strReturn = str + " " + strUnit[iUnitIndex];
            }
            iUnitIndex++;
        }
        if (bNegative)
            strReturn = "âm " + strReturn;
        return strReturn;
    }


    private static String pronounceVietnameseNumber(byte bUnit, byte bTen, byte bHundred, boolean bMax) {
        // Return zero
        if (bUnit == 0 && bTen == 0 && bHundred == 0)
            return "";

        String strUnitSuffix[] = new String[]{"", "một", "hai", "ba", "tư", "lăm", "sáu", "bảy", "tám", "chín"};
        String strUnitTen[] = new String[]{"", "mư�?i một", "mư�?i hai", "mư�?i ba", "mư�?i bốn", "mư�?i lăm",
                "mư�?i sáu", "mư�?i bảy", "mư�?i tám", "mư�?i chín"};
        String strUnit[] = new String[]{"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String strTenFirst[] = new String[]{"", "mư�?i một", "hai mươi mốt", "ba mươi mốt", "bốn mươi mốt",
                "năm mươi mốt", "sáu mươi mốt", "bảy mươi mốt", "tám mươi mốt", "chín mươi mốt"};
        String strTen[] = new String[]{"", "mư�?i", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi",
                "bảy mươi", "tám mươi", "chín mươi"};
        String strHundred[] = new String[]{"không trăm", "một trăm", "hai trăm", "ba trăm", "bốn trăm", "năm trăm",
                "sáu trăm", "bảy trăm", "tám trăm", "chín trăm"};
        String strReturn = "";

        if (bMax || bHundred > 0)
            strReturn = strHundred[bHundred];
        if (bTen > 0) {
            if (strReturn.length() > 0)
                strReturn += " ";
            if (bUnit > 0) {
                if (bTen == 1)
                    strReturn += strUnitTen[bUnit];
                else {
                    if (bUnit == 1)
                        strReturn += strTenFirst[bTen];
                    else
                        strReturn += strTen[bTen] + " " + strUnitSuffix[bUnit];
                }
            } else
                strReturn += strTen[bTen];
        } else {
            if (bUnit > 0) {
                if (strReturn.length() > 0)
                    strReturn += " linh " + strUnit[bUnit];
                else
                    strReturn = strUnit[bUnit];
            }
        }
        return strReturn;
    }

    public static String align(String str, int iAlignment, int iLength) {
        if (str == null)
            return null;
        if (str.length() > iLength)
            return str.substring(0, iLength);
        StringBuffer buf = new StringBuffer();
        if (iAlignment == ALIGN_CENTER) {
            int iFirstLength = (iLength - str.length()) / 2;
            for (int iIndex = 0; iIndex < iFirstLength; iIndex++)
                buf.append(" ");
            buf.append(str);
            for (int iIndex = str.length() + iFirstLength; iIndex < iLength; iIndex++)
                buf.append(" ");
        } else if (iAlignment == ALIGN_RIGHT) {
            iLength = iLength - str.length();
            for (int iIndex = 0; iIndex < iLength; iIndex++)
                buf.append(" ");
            buf.append(str);
        } else {
            buf.append(str);
            for (int iIndex = str.length(); iIndex < iLength; iIndex++)
                buf.append(" ");
        }
        return buf.toString();
    }

    public static int compareVietnameseString(String o1, String o2) {
        return compareString(o1, o2, new Locale("vi"));
    }

    public static boolean stringIsNullOrEmty(String str) {
        if (str == null)
            return true;
        else {
            if (str.trim().length() <= 0)
                return true;
        }
        return false;
    }

    public static boolean stringIsNullOrEmty(Object str) {
        if (str == null)
            return true;
        else {
            if (str.toString().trim().length() <= 0)
                return true;
        }
        return false;
    }

    public static int compareString(String strObj1, String strObj2, Locale locale) {
        final String DELIMITERS = "\\p{Cntrl}\\s\\p{Punct}\u0080-\u00BF\u2000-\uFFFF";
        Collator primary = null;
        Collator secondary = null;
        if (primary == null) {
            primary = Collator.getInstance(locale);
            secondary = (Collator) primary.clone();
            secondary.setStrength(Collator.SECONDARY);
        }

        int result;
        // String o1 = str1;
        // String o2 = str;
        String[] s1 = (" " + strObj1).split("[" + DELIMITERS + "]+");
        String[] s2 = (" " + strObj2).split("[" + DELIMITERS + "]+");
        for (int i = 1; i < s1.length && i < s2.length; i++) {
            result = secondary.compare(s1[i], s2[i]);
            if (result != 0) {
                return result;
            }
        }

        if (s1.length > s2.length) {
            return 1;
        } else if (s1.length < s2.length) {
            return -1;
        }

        for (int i = 1; i < s1.length; i++) {
            result = primary.compare(s1[i], s2[i]);
            if (result != 0) {
                return result;
            }

        }

        s1 = (strObj1 + " ").split("[^" + DELIMITERS + "]+");
        s2 = (strObj2 + " ").split("[^" + DELIMITERS + "]+");

        for (int i = 1; i < s1.length - 1 && i < s2.length - 1; i++) {
            result = primary.compare(s1[i], s2[i]);
            if (result != 0) {
                return result;
            }
        }

        result = primary.compare(s1[0], s2[0]);

        if (result != 0) {
            return result;
        }

        return primary.compare(strObj1, strObj2);
    }
    public static List<String> strCodeToList(String str) {
        List<String> list = new ArrayList<String>();
        String[] arrStr = str.split(",");
        for (String string : arrStr) {
            list.add(string);
        }
        return list;
    }

    public static String convertListToString(List<Object> list) {
        String data = "";
        if (list != null) {
            if (!list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        data += "'" + list.get(i) + "'";
                        // data += list.get(i);
                    } else {
                        data += "'" + list.get(i) + "',";
                        // data += list.get(i)+",";
                    }
                }
            }
        }
        return data;
    }

    public static String listToString(List<String> list, String strSeparator) {
        String str = null;
        for (Object string : list) {
            if (str == null) {
                if (string instanceof BigDecimal) {
                    str = String.valueOf(string);
                } else {
                    str = string.toString();
                }
            } else {
                if (string instanceof BigDecimal) {
                    str += strSeparator + String.valueOf(string);
                } else {
                    str += strSeparator + string.toString();
                }
            }
        }
        return str;
    }

    public static String listToString(List<String> list, String strSeparator, String strChar) {
        String str = null;
        for (String string : list) {
            if (str == null) {
                str = strChar + string + strChar;
            } else {
                str += strSeparator + strChar + string + strChar;
            }
        }
        return str;
    }

    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static boolean isNumericLong(String str) {
        try {
            Long.parseLong(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String getParamSQLWithLike(String param) {
        if (StringUtil.stringIsNullOrEmty(param)) {
            return "";
        }
        return "%" + param.trim() + "%";
    }

    public static boolean checkValidPath(String path) {
        String regularExpression = "((/)*[a-zA-Z0-9_-]+(/)*)+";
        Pattern pattern = Pattern.compile(regularExpression);
        return Pattern.matches(regularExpression, path);
    }

    public static String extractDirectoryPath(String path) {
        int index = path.lastIndexOf("/");
        return path.substring(0, index);
    }

    public static String extractFileName(String path) {
        int index = path.lastIndexOf("/");
        return path.substring(index);
    }

    public static String trimPhoneNumber(String msisdn) {
        if (StringUtil.stringIsNullOrEmty(msisdn)) {
            return "";
        } else {
            msisdn = msisdn.trim();
            if (msisdn.startsWith("0")) {
                msisdn = msisdn.substring(1);
            } else if (msisdn.startsWith("84")) {
                msisdn = msisdn.substring(2);
            } else if (msisdn.startsWith("+84")) {
                msisdn = msisdn.substring(3);
            }
        }
        return msisdn;
    }


    public static String objectToXml(Object messageContent, Class c) throws Exception {
        Marshaller marshaller = JAXBContext.newInstance(c).createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(messageContent, stringWriter);
        return stringWriter.toString();
    }

    private static String getString(String tagName, Element element) {
        NodeList list = element.getElementsByTagName(tagName);
        if (list != null && list.getLength() > 0) {
            NodeList subList = list.item(0).getChildNodes();

            if (subList != null && subList.getLength() > 0) {
                return subList.item(0).getNodeValue();
            }
        }
        return null;
    }

    public static String cleanPath(String fullPath) {
        if (stringIsNullOrEmty(fullPath)) return fullPath;
        int index = fullPath.lastIndexOf(File.separator);
        return fullPath.substring(index + 1);
    }

    public static boolean isListEmpty(List lst) {
        return lst == null || lst.isEmpty();
    }

    public static boolean isArrEmpty(Object[] arr) {
        return arr == null || arr.length == 0;
    }

    public static String generatePassword(int length) {
        assert length >= 4;
        char[] password = new char[length];

        //get the requirements out of the way
        password[0] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
        password[1] = UPPERCASE[rand.nextInt(UPPERCASE.length)];
        password[2] = NUMBERS[rand.nextInt(NUMBERS.length)];
        password[3] = SYMBOLS[rand.nextInt(SYMBOLS.length)];

        //populate rest of the password with random chars
        for (int i = 4; i < length; i++) {
            password[i] = ALL_CHARS[rand.nextInt(ALL_CHARS.length)];
        }

        //shuffle it up
        for (int i = 0; i < password.length; i++) {
            int randomPosition = rand.nextInt(password.length);
            char temp = password[i];
            password[i] = password[randomPosition];
            password[randomPosition] = temp;
        }

        return new String(password);
    }

    public static Long safeToLong(Object obj1, Long defaultValue) {
        if (obj1 == null) {
            return defaultValue;
        }
        if (obj1 instanceof BigDecimal) {
            return ((BigDecimal) obj1).longValue();
        }
        if (obj1 instanceof BigInteger) {
            return ((BigInteger) obj1).longValue();
        }
        if (obj1 instanceof Double) {
            return ((Double) obj1).longValue();
        }

        try {
            return Long.parseLong(obj1.toString());
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * @param obj1 Object
     * @return Long
     */
    public static Long safeToLong(Object obj1) {
        return safeToLong(obj1, 0L);
    }

    public static Double safeToDouble(Object obj1, Double defaultValue) {
        if (obj1 == null) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(obj1.toString());
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static Double safeToDouble(Object obj1) {
        return safeToDouble(obj1, 0.0);
    }

    public static Short safeToShort(Object obj1, Short defaultValue) {
        if (obj1 == null) {
            return defaultValue;
        }
        try {
            return Short.parseShort(obj1.toString());
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static Short safeToShort(Object obj1) {
        return safeToShort(obj1, (short) 0);
    }

    /**
     * @param obj1
     * @param defaultValue
     * @return
     * @author
     */
    public static int safeToInt(Object obj1, int defaultValue) {
        if (obj1 == null) {
            return defaultValue;
        }
        try {
            String data = obj1.toString();
            if (data.contains(".")) {
                data = data.substring(0, data.indexOf("."));
            }

            if (data.contains(",")) {
                data = data.substring(0, data.indexOf(","));
            }

            return Integer.parseInt(data);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * @param obj1 Object
     * @return int
     */
    public static int safeToInt(Object obj1) {
        return safeToInt(obj1, 0);
    }

    /**
     * @param obj1 Object
     * @return String
     */
    public static String safeToString(Object obj1, String defaultValue) {
        if (obj1 == null) {
            return defaultValue;
        }

        return obj1.toString().trim();
    }

    /**
     * @param obj1 Object
     * @return String
     */
    public static String safeToString(Object obj1) {
        return safeToString(obj1, "");
    }

    public static Date safeToDate(Object obj1) {
        if (obj1 == null) {
            return null;
        }
        return (Date) obj1;
    }

    public static String toHexString(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

    private static final String password = "FeEdBAck";
    private static final String salt = "43686174626f742d4d6f6269466f6e65";
    private static final int INPUT_LENGTH = 63;

    public static Object jsonToObjectNotNull(String json, Class c) throws InstantiationException, IllegalAccessException {
        try {
            if (stringIsNullOrEmty(json)) {
                return c.newInstance();
            }
            return new Gson().fromJson(json, c);
        } catch (Exception e) {
            return c.newInstance();
        }
    }
}
