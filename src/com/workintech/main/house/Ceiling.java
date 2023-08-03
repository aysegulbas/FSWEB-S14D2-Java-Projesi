package com.workintech.main.house;

import com.workintech.main.enums.PaintedColor;

public class Ceiling {
    private int height;
    private PaintedColor color;

    public Ceiling(int height, PaintedColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintedColor getColor() {
        return color;
    }
    public void create(){
        System.out.println("height:"+height+"paintingcolor: "+color);//stringbuilder(tek satır ile çözüm-bu şekilde 6 satır yazar) ile de yapılabilirdi
    }

}
