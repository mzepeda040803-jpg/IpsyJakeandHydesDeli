package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private BreadType breadType;
    private int size;
    private boolean toasted;
    private List<String> meats;
    private List<String> cheeses;
    private List<String> toppings;
    private List<String> sauces;
    private double totalPrice;

    public Sandwich(BreadType breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
        this.toasted = toasted;
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addMeat(String meat) {
        meats.add(meat);
    }

    public void addCheese(String cheese) {
        cheeses.add(cheese);
    }

    public void addToppings(String topping) {
        toppings.add(topping);
    }

    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType=" + breadType +
                ", size=" + size +
                ", toasted=" + toasted +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", toppings=" + toppings +
                ", sauces=" + sauces +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
