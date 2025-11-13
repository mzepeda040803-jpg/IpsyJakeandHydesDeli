package com.pluralsight;

public class RegularTopping extends Topping {
    private String type;

    public RegularTopping(String type) {
        super(type, false, false);
//        this.type = type;
    }

    public double getPrice(int size) {
        return 0.0;
    }
}
