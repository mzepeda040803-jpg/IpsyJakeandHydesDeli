package com.pluralsight;

public class Topping {
    private String toppingName;
    private boolean extraToppings;

    public Topping(String toppingName, boolean extraToppings) {
        this.toppingName = toppingName;
        this.extraToppings = extraToppings;
    }

    public String getToppingName() {
        return toppingName;
    }

    public boolean isExtraToppings() {
        return extraToppings;
    }
}


