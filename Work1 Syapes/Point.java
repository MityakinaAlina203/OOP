package shapes;

public class Point extends Shape {
    private double x;
    private double y;

    public Point()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public void draw() {
        System.out.println("Фигура: Точка");
        System.out.println("Координаты X: " + x);
        System.out.println("Координаты Y: " + y);
    }
    public double distanceTo(Point otherPoint) {
        double dx = otherPoint.getX() - x;
        double dy = otherPoint.getY() - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getArea() {
        return 0.0; // площадь точки равна 0
    }


    public double getPerimeter() {
        return 0.0; // периметр точки равен 0
    }


    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }
}