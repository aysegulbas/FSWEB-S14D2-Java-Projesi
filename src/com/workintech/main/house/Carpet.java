package com.workintech.main.house;

import com.workintech.main.enums.PaintedColor;

public class Carpet {
    private int width;
    private int height;
    private PaintedColor color;

    public Carpet(int width, int height, PaintedColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public PaintedColor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
