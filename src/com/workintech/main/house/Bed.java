package com.workintech.main.house;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style,int pillows, int height, int sheets, int quilts) {
        this.style=style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }


    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("****************");
        builder.append("Style: "+style+"\n");//\n alt satıra atar
        builder.append("Height: "+height+"\n");
        builder.append("Pillow: "+pillows+"\n");
        builder.append("Sheets: "+sheets+"\n");
        builder.append("Quilts: "+quilts+"\n");

        builder.append("****************");
        return builder.toString();

    }
}
