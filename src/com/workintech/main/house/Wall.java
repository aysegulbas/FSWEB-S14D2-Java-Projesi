package com.workintech.main.house;

import com.workintech.main.enums.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
    public void create(){
        System.out.println("Wall has been created at:"+getDirection());
    }
}
