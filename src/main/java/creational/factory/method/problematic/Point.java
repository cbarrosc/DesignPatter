package creational.factory.method.problematic;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //Constructor for polar coordinates (can't have only two parameters in java)
    public Point(double rho, double theta, boolean polar) {
        if (polar) {
            x = rho * Math.cos(theta);
            y = rho * Math.sin(theta);
        }
    }

    //Unified constructor
    /**
     * @param a is x if cartesioan or rho if polar
     * @param b is y if cartesioan or theta if polar
     * @param cs is the coordinate system
     */
    public Point(CoordinateSystem cs, double a, double b) {
        switch (cs) {
            case CARTESIAN -> {
                x = a;
                y = b;
            }
            case POLAR -> {
                x = a * Math.cos(b);
                y = a * Math.sin(b);
            }
        }
    }

}
