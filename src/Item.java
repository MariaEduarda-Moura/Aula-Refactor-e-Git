public class Item {
    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void update() {
        final boolean isAgedBrie = name.equals("Aged Brie");
        final boolean isBackstagePass = name.equals("Backstage passes to a TAFKAL80ETC concert");
        final boolean isSulfuras = name.equals("Sulfuras, Hand of Ragnaros");
        final boolean isConjured = name.equals("Conjured Mana Cake");
        final boolean isEternal = name.equals("Eternal Artifact");
        final boolean isPerishable = name.contains("Perishable");

        if (!isAgedBrie && !isBackstagePass && !isConjured && !isEternal) {
            if (quality > 0) {
                if (!isSulfuras) {
                    quality = quality - 1;
                    if (isPerishable) {
                        quality = quality - 1;
                    }
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
                if (isBackstagePass) {
                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                } else if (isConjured) {
                    quality = quality + 1;
                } else if (isEternal) {
                    if (sellIn % 2 == 0) {
                        quality = quality + 1;
                    }
                }
            }
        }

        if (!isSulfuras && !isEternal) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!isAgedBrie) {
                if (!isBackstagePass) {
                    if (quality > 0) {
                        if (!isSulfuras) {
                            quality = quality - 1;
                            if (isConjured) {
                                quality = quality - 1;
                            }
                            if (isPerishable) {
                                quality = quality - 2;
                            }
                        }
                    } else {
                        this.quality=0;
                    }
                } else {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
                if (isEternal && quality < 50) {
                    quality = quality + 1;
                }
            }
        }

        if (quality > 50 && !isSulfuras) {
            quality = 50;
        }
        if (quality < 0) {
            quality = 0;
        }
    }
    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}