package com.pluralsight;

import java.security.PrivateKey;
import java.util.ArrayList;

public class Cheese {
    private String type;
    private boolean extra;

    public Cheese(String type, boolean extra) {
        this.type = type;
        this.extra = extra;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    public double getTotalPrice (int size) {
        double price = switch (size) {
            case 4 -> 0.75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0.0;
        };

        if (extra) {
            price += switch (size) {
                case 4 -> 0.30;
                case 8 -> 0.60;
                case 12 -> 0.90;
                default -> 0.0;
            };

        }
        return price;
    }

}
