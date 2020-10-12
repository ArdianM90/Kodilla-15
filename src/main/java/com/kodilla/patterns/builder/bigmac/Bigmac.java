package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bigmac {

    public static final String STANDARD = "standard";
    public static final String THOUSAND_ISLAND = "thosand_island";
    public static final String BARBECUE = "barbecue";
    public static final String[] AVAILABLE_INGREDIENTS = {"Lettuce", "Onion", "Bacon", "Cucumber", "Chilli peppers", "Mushrooms", "Prawns", "Cheese"};
    private final List<String> ingredients;
    private final boolean bunWithSesame;
    private final int burgers;
    private final String sauce;

    public static class BigmacBuilder {
        private boolean bunWithSesame;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder(boolean bunWithSesame, int burgersQuantity) {
            this.bunWithSesame = bunWithSesame;
            if (burgersQuantity >= 1) {
                this.burgers = burgersQuantity;
            } else {
                throw new IllegalStateException("Bigmac without burger is not possible. You have to order at least one.");
            }
        }

        public Bigmac.BigmacBuilder sauce(String sauce) {
            if (sauce.equals(STANDARD) || sauce.equals(THOUSAND_ISLAND) || sauce.equals(BARBECUE)) {
                this.sauce = sauce;
            } else {
                throw new IllegalStateException("Requested sauce is not available.");
            }
            this.sauce = sauce;
            return this;
        }

        public Bigmac.BigmacBuilder ingredient(String ingredient) {
            if (Arrays.asList(AVAILABLE_INGREDIENTS).contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                throw new IllegalStateException("Requested ingredient is not available.");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bunWithSesame, burgers, sauce, ingredients);
        }
    }

    private Bigmac(final boolean bunWithSesame, final int burgers, final String sauce, List<String> ingredients) {
        this.bunWithSesame = bunWithSesame;
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
                "bun with sesame - "+bunWithSesame+"; "+
                "burgers quantity - "+burgers+"; "+
                "sauce - "+sauce+"; "+
                "ingredients - "+ingredients;
    }
}
