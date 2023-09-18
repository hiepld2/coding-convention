package solution.code.refactor.gildedRose.updater;

import solution.code.refactor.gildedRose.Item;

public class ConjuredUpdater implements Updater {
    @Override
    public void update(Item item) {
        item.setQuality(item.getQuality() - 2);
        if (item.getQuality() < 0) {
            item.setQuality(0);
        }
        item.setSellIn(item.getSellIn() - 1);
    }
}
