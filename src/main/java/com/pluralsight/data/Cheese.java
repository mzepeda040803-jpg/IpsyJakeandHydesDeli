package com.pluralsight.data;

public class Cheese extends Topping {
    private String type;
    private boolean extra;

    public Cheese(String type, boolean extra) {
        super(type, extra, true);
//        this.type = type;
//        this.extra = extra;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    public double getPrice (int size) {
        double price = switch (size) {
            case 4 -> 0.75;
            case 8 -> 1.50;
            case 12 -> 2.25;
            default -> 0.0;
        };

        if (isExtra()) {
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
