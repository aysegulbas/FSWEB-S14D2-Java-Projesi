package com.workintech.main.house;

import com.workintech.main.enums.LampType;

public class Lamp {
    private boolean battery;
    private LampType style;
    private int globRating;

    public Lamp(boolean battery, LampType style, int globRating) {
        this.battery = battery;
        this.style = style;
        this.globRating = globRating;
    }
    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }
    public LampType getStyle(){
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("****************");
        builder.append("Style: "+style+"\n");//\n alt satıra atar
        builder.append("GlobRating: "+globRating+"\n");

        builder.append("****************");
        return builder.toString();

    }
}

