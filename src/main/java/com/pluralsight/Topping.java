package com.pluralsight;

public class Topping {
    private String type;
    private boolean extra;
    private boolean premium;

    public Topping(String type, boolean extra, boolean premium) {
        this.type = type;
        this.extra = extra;
        this.premium = premium;
    }

    public String getType() {
        return type;
    }

    public boolean isExtra() {
        return extra;
    }

    public boolean isPremium() {
        return premium;
    }

    public double getPrice(int size) {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "type='" + type + '\'' +
                ", extra=" + extra +
                ", premium=" + premium +
                '}';
    }
}


