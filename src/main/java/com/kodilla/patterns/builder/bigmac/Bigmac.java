package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final boolean bun;
    private final int burgers;
    private final String sauce;
    public static final String STANDARD = "standard";
    public static final String THOUSAND_ISLAND = "thosand_island";
    public static final String BARBECUE = "barbecue";
    private final List<String> ingredients; //lista składników dodatkowych (możliwe wartości to: sałata, cebula, bekon, ogórek, papryczki chilli, pieczarki, krewetki, ser).

    public static class BigmacBuilder {
        private boolean bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public Bigmac.BigmacBuilder bun(boolean sesame) {
            this.bun = sesame;
            return this;
        }

        public Bigmac.BigmacBuilder burgers(int quantity) {
            this.burgers = quantity;
            return this;
        }

        public Bigmac.BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(THOUSAND_ISLAND) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Figures of checkers should be BLACK or WHITE!");
            }

            this.sauce = sauce;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final boolean bunWithSesame, final int burgers, final String sauce, List<String> ingredients) {
        this.bun = bunWithSesame;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac: " +
                "bun with sesame - "+bun+"; "+
                "burgers quantity - "+burgers+"; "+
                "sauce - "+sauce+"; "+
                "ingredients - "+ingredients;
    }
}
