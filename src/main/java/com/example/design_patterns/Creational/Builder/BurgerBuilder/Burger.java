package com.example.design_patterns.Creational.Builder.BurgerBuilder;

public class Burger {
    private String bun;
    private String patty;
    private String cheese;
    private String sauce;
    private boolean hasLettuce;
    private boolean hasBacon;

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
        this.hasLettuce = builder.hasLettuce;
        this.hasBacon = builder.hasBacon;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                ", hasLettuce=" + hasLettuce +
                ", hasBacon=" + hasBacon +
                '}';
    }

    public static class BurgerBuilder {
        private String bun;
        private String patty;
        private String cheese;
        private String sauce;
        private boolean hasLettuce;
        private boolean hasBacon;

        public BurgerBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BurgerBuilder patty(String patty) {
            this.patty = patty;
            return this;
        }

        public BurgerBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BurgerBuilder lettuce(boolean hasLettuce) {
            this.hasLettuce = hasLettuce;
            return this;
        }

        public BurgerBuilder bacon(boolean hasBacon) {
            this.hasBacon = hasBacon;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }
    }
}
