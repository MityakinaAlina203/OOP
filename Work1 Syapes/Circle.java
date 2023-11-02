package shapes;

public class Circle extends Shape {
    private Point point;
    private double radius;

    public Circle() {
        super();
        this.point = new Point();
        this.radius = 0.0;
    }

    public Circle(Point point, double radius) {
        super();
        this.point = point;
        this.radius = radius;
        validate();
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        validate();
    }

    private void validate() {
        if (radius <= 0) {
            throw new IllegalArgumentException("Unable to create shape: radius cannot be less than or equal to zero");
        }
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }


    public void move(int x, int y) {
        point.move(x, y);
    }
}
