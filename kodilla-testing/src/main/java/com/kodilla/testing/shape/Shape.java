package com.kodilla.testing.shape;

interface Shape {
    String name;
    double field;

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
