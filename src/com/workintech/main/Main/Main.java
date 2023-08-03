package com.workintech.main.Main;

import com.workintech.main.enums.Direction;
import com.workintech.main.enums.LampType;
import com.workintech.main.enums.PaintedColor;
import com.workintech.main.house.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Ahmet",
                new Wall(Direction.NORTH),
                new Wall(Direction.SOUTH),
                new Wall(Direction.WEST),
                new Wall(Direction.EAST),
                new Ceiling(3, PaintedColor.WHITE),
                new Lamp(true,LampType.NEON,4),
                new Bed("Çift Kişilik", 4, 1, 2, 2),
                new Carpet(3,5, PaintedColor.PINK),
                new Wardrobe(2, 4, 40)

                );

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();

        System.out.println("********************");

        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());


    }
}