package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String breadType;
    private int size;
    private boolean toasted;
    private List<Meat> meats;
    private List<Cheese> cheeses;
    private List<Topping> toppings;
    private List<Sauce> sauces;
    private List<Side> sides;
//    private double basePrice;
    private double totalPrice;

    public Sandwich(String breadType, int size, boolean toasted) {
        this.breadType = breadType;
        this.size = size;
        this.toasted = toasted;
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.sides = new ArrayList<>();

        double basePrice;
        switch (size) {
            case 4:
                basePrice = 5.50;
                break;
            case 8:
                basePrice = 7.00;
                break;
            case 12:
                basePrice = 8.50;
                break;
            default:
                System.out.println("Invalid option, please try again.");
                basePrice = 0.0;
        }
        this.totalPrice = 0.0;

    }

    public String getBreadType() {
        return breadType;
    }

    public int getSize() {
        return size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void addMeat(Meat meat) {
        meats.add(meat);
    }

    public void addCheese(Cheese cheese) {
        cheeses.add(cheese);
    }

    public void addToppings(Topping topping) {
        toppings.add(topping);
    }

    public void addSauce(Sauce sauce) {
        sauces.add(sauce);
    }

    public void addSide(Side side) {
        sides.add((Side) sides);
    }

    public double getPrice() {
        return totalPrice;
    }

    public void addDrink(Drink drink) {
        drink.getDrinkName();
    }

    public double getTotalPrice() {
        double price = 0.0;

        switch (size) {
            case 4 -> price += 5.50;
            case 8 -> price += 7.00;
            case 12 -> price += 8.50;
        }

        for (Meat meat : meats) {
            price += meat.getPrice(size);
        }

        for (Cheese cheese : cheeses) {
            price += cheese.getPrice(size);
        }

        for (Topping topping : toppings) {
            price += topping.getPrice(size);
        }

        for (Sauce sauce : sauces) {
            price += sauce.getPrice(size);
        }

        totalPrice = price;
        return price;

    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
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

//        double price = basePrice;
//        for (String meat: meats) {
//            price += switch (size) {
//                case 4 -> 1.00;
//                case 8 -> 2.00;
//                case 12 -> 3.00;
//                default -> 0.0;
//
//            }
//        }
 //   }
//        double price = size;
//        this.totalPrice = price;
//        return totalPrice;
//    };