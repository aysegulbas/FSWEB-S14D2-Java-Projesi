package com.workintech.main.house;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(int width, int height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }

    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("****************");
        builder.append("Width: "+width+"\n");//\n alt satıra atar
        builder.append("Height: "+height+"\n");
        builder.append("Weight: "+weight+"\n");

        builder.append("****************");
        return builder.toString();
    }
}
