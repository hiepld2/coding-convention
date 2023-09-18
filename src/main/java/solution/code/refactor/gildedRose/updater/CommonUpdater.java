package solution.code.refactor.gildedRose.updater;

import solution.code.refactor.gildedRose.Item;

public class CommonUpdater implements Updater {
    @Override
    public void update(Item item) {
        if (canLowerQuality(item)) {
            item.setQuality(item.getQuality() - 1);
            if (pastExpirationDate(item)) {
                item.setQuality(item.getQuality() - 1);
            }
        }

        item.setSellIn(item.getSellIn() - 1);
    }

    private boolean pastExpirationDate(Item item) {
        return item.getSellIn() <= 0;
    }

    private boolean canLowerQuality(Item item) {
        return item.getQuality() > 0;
    }
}
