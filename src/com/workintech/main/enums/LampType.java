package com.workintech.main.enums;

public enum LampType {
    NEON("NEON"),
    HALOGEN("NEON");
    private String style;

    LampType(String style) {
        this.style=style;
    }

    public String getName() {
        return style;
    }
}
