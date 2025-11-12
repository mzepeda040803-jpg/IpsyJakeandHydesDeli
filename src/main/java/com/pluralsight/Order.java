package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private double totalPrice;

    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
        totalPrice = 0.0;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
        totalPrice += sandwich.getTotalPrice();

    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
        totalPrice += drink.getPriceOfDrink();

    }

    public void addChips(Chips chips) {
        this.chips.add(chips);
        totalPrice += chips.getPriceOfChips();

    }
    public void getTotal() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}






//    List<Sandwich> sandwiches = get Sandwich;
//    List<Drinks>; ...same for here, getter
//    List<Chips>; ...same, need getter
    // create List for order items (sandwiches, drinks, and chips)
    // store total price

    // constructor:
    //   - initialize the class proprieties

    // addSandwich method:
    //   - add sandwich to list

    // addDrink method:
    //   - add drink to list

    // addChips method:
    //   - add chips to list

    // getTotal method:
    //   - return total price of order

    // getSandwiches, getDrinks, getChips:
    //   - return the orders items

    // getOrderSummary method:
    //   - return formatted string of all items and total

    //**like portfolio class in other class work







