package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String shapeName;
    int field;

    public Triangle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (field != triangle.field) return false;
        return shapeName != null ? shapeName.equals(triangle.shapeName) : triangle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result = shapeName != null ? shapeName.hashCode() : 0;
        result = 31 * result + field;
        return result;
    }
}
