package solution.code.refactor.gildedRose;

import static java.util.Arrays.asList;
import static solution.code.refactor.gildedRose.updater.UpdaterFactory.updaterFor;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        asList(items).forEach(item -> updaterFor(item).update(item));
    }
}