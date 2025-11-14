package com.pluralsight.data;

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
//gonna be used for the regular toppings listed in the file;
//try to make it look neat in charts