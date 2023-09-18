package solution.code.refactor.gildedRose.updater;

import solution.code.refactor.gildedRose.Item;

public class BackstagePassesUpdater implements Updater {
    @Override
    public void update(Item item) {
        if (isAfterTheConcert(item)) {
            item.setQuality(0);
        } else if (item.getQuality() < 50) {
            Integer qualityIncrease = qualityIncreaseBy(item.getSellIn());
            item.setQuality(item.getQuality() + qualityIncrease);
        }
        item.setSellIn(item.getSellIn() - 1);

    }

    private Integer qualityIncreaseBy(Integer remainingDaysBeforeConcert) {
        if (remainingDaysBeforeConcert <= 5) {
            return 3;
        } else if (remainingDaysBeforeConcert <= 10) {
            return 2;
        } else {
            return 1;
        }
    }

    private boolean isAfterTheConcert(Item item) {
        return item.getSellIn() <= 0;
    }
}
