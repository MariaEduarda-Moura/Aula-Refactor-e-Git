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
        // Trocamos "item.name" por "this.name" (ou apenas "name")
        if (!name.equals("Aged Brie")
                && !name.equals("Backstage passes to a TAFKAL80ETC concert")
                && !name.equals("Conjured Mana Cake")
                && !name.equals("Eternal Artifact")) {
            if (quality > 0) {
                if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                    quality = quality - 1;
                    if (name.contains("Perishable")) {
                        quality = quality - 1;
                    }
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
                if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
                } else if (name.equals("Conjured Mana Cake")) {
                    quality = quality + 1;
                } else if (name.equals("Eternal Artifact")) {
                    if (sellIn % 2 == 0) {
                        quality = quality + 1;
                    }
                }
            }
        }

        if (!name.equals("Sulfuras, Hand of Ragnaros") && !name.equals("Eternal Artifact")) {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if (!name.equals("Aged Brie")) {
                if (!name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (quality > 0) {
                        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
                            quality = quality - 1;
                            if (name.equals("Conjured Mana Cake")) {
                                quality = quality - 1;
                            }
                            if (name.contains("Perishable")) {
                                quality = quality - 2;
                            }
                        }
                    } else {
                        quality = quality - quality;
                    }
                } else {
                    if (quality < 50) {
                        quality = quality + 1;
                    }
                }
                if (name.equals("Eternal Artifact") && quality < 50) {
                    quality = quality + 1;
                }
            }
        }

        if (quality > 50 && !name.equals("Sulfuras, Hand of Ragnaros")) {
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