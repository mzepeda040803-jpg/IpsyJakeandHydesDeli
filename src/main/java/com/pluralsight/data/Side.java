package com.pluralsight.data;

public class Side extends Topping {
//    private String type;

    public Side(String type) {
        super(type, false, false);
//        this.type = type;
    }

//    public Side(String sideType) {
//        super();
//    }

//    @Override
//    public String getType() {
//        return type;
//    }


    @Override
    public double getPrice(int size) {
        return 0.0;
    }
}
