package shapes;

public class Rectangle extends Shape {
    private Point point1;
    private Point point2;

    public Rectangle() {
        super();
        this.point1 = new Point();
        this.point2 = new Point();
    }

    public Rectangle(Point point1, Point point2) {
        super();
        this.point1 = point1;
        this.point2 = point2;
        validate();
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
        validate();
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
        validate();
    }

    private void validate() {
        if (point1.getX() == point2.getX() || point1.getY() == point2.getY()) {
            throw new IllegalArgumentException("Unable to create shape: points cannot be on the same line");
        }
    }


    public double getArea() {
        return Math.abs(point1.getX() - point2.getX()) * Math.abs(point1.getY() - point2.getY());
    }


    public double getPerimeter() {
        return 2 * (Math.abs(point1.getX() - point2.getX()) + Math.abs(point1.getY() - point2.getY()));
    }


    public void move(int x, int y) {
        point1.move(x, y);
        point2.move(x, y);
    }
}