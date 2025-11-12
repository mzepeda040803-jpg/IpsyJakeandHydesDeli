package com.pluralsight;

public class Meat extends Topping {
    private String type;
    private boolean extra;

    public Meat(String type, boolean extra) {
        super(type, true, extra);
        this.type = type;
        this.extra = extra;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    public double getPrice (int size) {
        double price = switch (size) {
            case 4 -> 1.00;
            case 8 -> 2.00;
            case 12 -> 3.00;
            default -> 0.0;
        };

        if (isExtra()) {
            price += switch (size) {
                case 4 -> 0.50;
                case 8 -> 1.00;
                case 12 -> 1.50;
                default -> 0.0;
            };
        }

        return price;
    }

}
