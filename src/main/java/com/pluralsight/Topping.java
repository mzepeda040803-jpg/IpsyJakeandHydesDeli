package com.pluralsight;

public class Topping {
    private String typeOfTopping;
    private boolean extraToppings;
    private boolean premiumToppings;

    public Topping(String typeOfTopping, boolean extraToppings, boolean premiumToppings) {
        this.typeOfTopping = typeOfTopping;
        this.extraToppings = extraToppings;
        this.premiumToppings = premiumToppings;
    }

    public String getTypeOfTopping() {
        return typeOfTopping;
    }

    public boolean isExtraToppings() {
        return extraToppings;
    }

    public boolean isPremiumToppings() {
        return premiumToppings;
    }

    public double getTotalPrice () {
        return 0.0;
    }

    public double getPrice(int size) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "typeOfTopping='" + typeOfTopping + '\'' +
                ", extraToppings=" + extraToppings +
                ", premiumToppings=" + premiumToppings +
                '}';
    }
}


