package shapes;

public class Triangle extends Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    private boolean isValidTriangle() {
        // Проверка, что точки не лежат на одной прямой
        double area = 0.5 * ((point2.getX() - point1.getX()) * (point3.getY() - point1.getY()) -
                (point3.getX() - point1.getX()) * (point2.getY() - point1.getY()));
        return area != 0;
    }

    public double getArea()
    {
        // Вычисление площади треугольника с помощью формулы Герона
        double a = point1.distanceTo(point2) ;
        double b = point2.distanceTo(point3);
        double c = point3.distanceTo(point1);
        double s = (a + b + c) / 2;  // Полупериметр
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public double getPerimeter() {
        // Вычисление периметра треугольника
        double a = point1.distanceTo(point2);
        double b = point2.distanceTo(point3);
        double c = point3.distanceTo(point1);
        return a + b + c;
    }


    public void move(double moveX, double moveY) {
        // Перемещение треугольника на заданное расстояние по координатам
        point1.move(moveX, moveY);
        point2.move(moveX, moveY);
        point3.move(moveX, moveY);
    }
}

