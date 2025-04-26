package com.example.design_patterns.Creational.Builder.HouseBuilder;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarden;
    private boolean hasSwimmingPool;
    private boolean hasGarage;

    private House(Builder builder){
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarage=" + hasGarage +
                '}';
    }

    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarden;
        private boolean hasSwimmingPool;
        private boolean hasGarage;

        public Builder foundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder structure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder garden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder swimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder garage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
