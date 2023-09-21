package solution.code.refactor.gildedRose.updater;

import solution.code.refactor.gildedRose.Item;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdaterFactory {

    private static final Map<String, List<String>> itemTypes = new HashMap<>();

    static {
        itemTypes.put("backstage-passes", Collections.singletonList("Backstage passes to a TAFKAL80ETC concert"));
        itemTypes.put("legendary", Collections.singletonList("Sulfuras, Hand of Ragnaros"));
        itemTypes.put("improves-with-age", Collections.singletonList("Aged Brie"));
        itemTypes.put("conjured", Collections.singletonList("Conjured Mana Cake"));
    }

    public static Updater getUpdater(Item currentItem) {
        if (improvesWithAge(currentItem)) {
            return new AgedBrieUpdater();
        } else if (isLegendary(currentItem)) {
            return new LegendaryUpdater();
        } else if (isBackstagePass(currentItem)) {
            return new BackstagePassesUpdater();
        } else if (isConjured(currentItem)) {
            return new ConjuredUpdater();
        } else {
            return new CommonUpdater();
        }
    }

    private static boolean isConjured(Item item) {
        return itemTypes.get("conjured").contains(item.getName());
    }

    private static boolean isBackstagePass(Item item) {
        return itemTypes.get("backstage-passes").contains(item.getName());
    }

    private static boolean isLegendary(Item item) {
        return itemTypes.get("legendary").contains(item.getName());
    }

    private static boolean improvesWithAge(Item item) {
        return itemTypes.get("improves-with-age").contains(item.getName());
    }

}