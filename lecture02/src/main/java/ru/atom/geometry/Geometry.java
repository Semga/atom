package ru.atom.geometry;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * ^ Y
 * |
 * |
 * |
 * |          X
 * .---------->
 */

public final class Geometry {

    private Geometry() {
    }

    /**
     * Bar is a rectangle, which borders are parallel to coordinate axis
     * Like selection bar in desktop, this bar is defined by two opposite corners
     * Bar is not oriented
     * (It is not relevant, which opposite corners you choose to define bar)
     *
     * @return new Bar
     */
    public static Collider createBar(int firstPointX, int firstCornerY, int secondCornerX, int secondCornerY) {
       /* Point point1 = new Point(firstPointX, firstCornerY);
        Point point2 = new Point(secondCornerX, secondCornerY);*/
        if (firstPointX == secondCornerX || firstCornerY == secondCornerY) {
            throw new NotImplementedException();
        }
        Bar bar = new Bar(firstPointX, firstCornerY, secondCornerX, secondCornerY);
        return bar;
    }

    /**
     * 2D point
     *
     * @return new Point
     */
    public static Collider createPoint(int x, int y) {

        //throw new NotImplementedException();
        Point point = new Point(x, y);
        return point;
    }

}

