package io.javabrains.moviecatalog.models;

public class CatalogItem {
    private String name;
    private String desc;
    private int rating;

    CatalogItem(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public static CatalogItemBuilder builder() {
        return new CatalogItemBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getRating() {
        return this.rating;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CatalogItem)) return false;
        final CatalogItem other = (CatalogItem) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) return false;
        if (this.getRating() != other.getRating()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CatalogItem;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $desc = this.getDesc();
        result = result * PRIME + ($desc == null ? 43 : $desc.hashCode());
        result = result * PRIME + this.getRating();
        return result;
    }

    public String toString() {
        return "CatalogItem(name=" + this.getName() + ", desc=" + this.getDesc() + ", rating=" + this.getRating() + ")";
    }

    public static class CatalogItemBuilder {
        private String name;
        private String desc;
        private int rating;

        CatalogItemBuilder() {
        }

        public CatalogItem.CatalogItemBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CatalogItem.CatalogItemBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public CatalogItem.CatalogItemBuilder rating(int rating) {
            this.rating = rating;
            return this;
        }

        public CatalogItem build() {
            return new CatalogItem(name, desc, rating);
        }

        public String toString() {
            return "CatalogItem.CatalogItemBuilder(name=" + this.name + ", desc=" + this.desc + ", rating=" + this.rating + ")";
        }
    }
}
