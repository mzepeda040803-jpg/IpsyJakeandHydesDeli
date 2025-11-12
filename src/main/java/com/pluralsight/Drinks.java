package com.pluralsight;

public class Drinks {
    private String drinkName;
    private String size;
    private double priceOfDrink;

    public Drinks(String drinkName, String size, double priceOfDrink) {
        this.drinkName = drinkName;
        this.size = size;
        this.priceOfDrink = priceOfDrink;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public String getSize() {
        return size;
    }

    public double getPriceOfDrink() {
        double price = switch (size) {
            case "S" -> 2.00;
            case "M" -> 2.50;
            case "L" -> 3.00;
            default -> 0.0;
        };

        return priceOfDrink;
    }
}
