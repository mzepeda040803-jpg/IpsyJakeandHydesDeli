package com.pluralsight;

import java.util.ArrayList;

public class Sauce extends Topping {
    private String type;

    public Sauce(String type) {
        super(type, false, false);
        this.type = type;
    }

    public double getPrice(int size) {
        return 0.0;
    }
}
