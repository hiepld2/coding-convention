package solution.code.refactor.gildedRose.updater;

import solution.code.refactor.gildedRose.Item;

public class AgedBrieUpdater implements Updater {
    @Override
    public void update(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
        item.setSellIn(item.getSellIn() - 1);
    }
}
