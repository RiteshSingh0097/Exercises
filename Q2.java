//Q2. Implement Factory Pattern to get the Polygon of differnt type.
package com.bootcamp.design_patterns;

interface NoOfSide {
    void printPolygon();
}

class Pentagon implements NoOfSide {

    @Override
    public void printPolygon() {
        System.out.println("Pentagon");
    }
}

class Hexagon implements NoOfSide {

    @Override
    public void printPolygon() {
        System.out.println("Hexagon");
    }
}

class Polygon {

    NoOfSide side;

    public NoOfSide getSide() {
        return side;
    }

    public void setSide(NoOfSide side) {
        this.side = side;
    }
}

class PolygonFactory {

    static Polygon getPolygonObject(int side) {
        Polygon polygon = new Polygon();

        switch (side) {
            case 5:
                polygon.setSide(new Pentagon());
                break;
            case 6:
                polygon.setSide(new Hexagon());
                break;
        }
        return polygon;
    }
}

public class Q2 {

    public static void main(String[] args) {

        Polygon pentagon = PolygonFactory.getPolygonObject(5);
        pentagon.getSide().printPolygon();
        Polygon hexagon = PolygonFactory.getPolygonObject(6);
        hexagon.getSide().printPolygon();
    }

}
