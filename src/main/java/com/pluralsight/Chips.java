package com.pluralsight;

public class Chips {
    private String typeofChips;
//    private double priceOfChips;
    //no boolean, chips are required/come with order


    public Chips(String typeofChips)  {
        this.typeofChips = typeofChips;
//        this.priceOfChips = priceOfChips;
    }

    public String getTypeofChips() {
        return typeofChips;
    }

    public double getPriceOfChips() {
        return 1.50;
    }
}
//standalone class, not extended to anything