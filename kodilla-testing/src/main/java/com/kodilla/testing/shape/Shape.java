package com.kodilla.testing.shape;

interface Shape {
    private String name;
    private double field;

    public Shape(String name, double field) {
        this.name = name;
        this.field = field;
    }

    getShapeName() {
        return this.name;
    };

    getField() {
        return this.field;
    };
}
