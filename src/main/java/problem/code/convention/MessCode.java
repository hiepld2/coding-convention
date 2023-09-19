package problem.code.convention;

import java.util.ArrayList;
import java.util.List;

public class MessCode {

    public static List<Transaction> lst = new ArrayList<>();

    static {
        lst.add(new Transaction(1L, "PAYMENT", "OPEN", "CREDIT_CARD", 4_500_000D));
        lst.add(new Transaction(2L, "PAYMENT", "OPEN", "PAYPAL", 2_000_000D));
        lst.add(new Transaction(3L, "REFUND", "OPEN", "CREDIT_CARD", 3_300_000D));
        lst.add(new Transaction(4L, "PAYMENT", "CLOSED", "PLAN", 1_500_000D));
    }

    public static void main(String[] args) {
        process(lst);
    }

    public static void process(List<Transaction> transactions) {
        if (transactions != null && !transactions.isEmpty()) {
            for (Transaction t : transactions) {
                if ("PAYMENT".equals(t.getType())) {
                    if ("OPEN".equals(t.getStatus())) {
                        if ("CREDIT_CARD".equals(t.getMethod())) {
                            creditCardPayment(t);
                        } else if ("PAYPAL".equals(t.getMethod())) {
                            payPalPayment(t);
                        } else if ("PLAN".equals(t.getMethod())) {
                            planPayment(t);
                        }
                    } else {
                        System.out.println("Invalid transaction type!");
                    }
                } else if ("REFUND".equals(t.getType())) {
                    if ("OPEN".equals(t.getStatus())) {
                        if ("CREDIT_CARD".equals(t.getMethod())) {
                            creditCardRefund(t);
                        } else if ("PAYPAL".equals(t.getMethod())){
                            payPalRefund(t);
                        } else if ("PLAN".equals(t.getMethod())) {
                            planRefund(t);
                        }
                    } else {
                        System.out.println("Invalid transaction type!" + t);
                    }
                } else {
                    System.out.println("Invalid transaction type!" + t);
                }
            }
        } else {
            System.out.println("No transactions provided!");
        }
    }

    public static void creditCardPayment(Transaction t) {
        System.out.println("Processing Credit Card payment for amount: " + t.getAmount());
    }

    public static void creditCardRefund(Transaction t) {
        System.out.println("Processing Credit Card refund for amount: " + t.getAmount());
    }

    public static void payPalPayment(Transaction t) {
        System.out.println("Processing PayPal payment for amount: " + t.getAmount());
    }

    public static void payPalRefund(Transaction t) {
        System.out.println("Processing PayPal refund for amount: " + t.getAmount());
    }

    public static void planPayment(Transaction t) {
        System.out.println("Processing Plan payment for amount: " + t.getAmount());
    }

    public static void planRefund(Transaction t) {
        System.out.println("Processing Plan refund for amount: " + t.getAmount());
    }
}

