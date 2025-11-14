package com.pluralsight;

public class Drink {
    private String drinkName;
    private String size;
//    private double priceOfDrink;

    public Drink(String drinkName, String size) {
        this.drinkName = drinkName;
        this.size = size;
//        this.priceOfDrink = priceOfDrink;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public String getSize() {
        return size;
    }

    public double getPriceOfDrink() {
        return switch (size) {
            case "S" -> 2.00;
            case "M" -> 2.50;
            case "L" -> 3.00;
            default -> 0.0;
        };

//        return price; //moving the return next to switch works the same and looks cleaner hehe

    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
