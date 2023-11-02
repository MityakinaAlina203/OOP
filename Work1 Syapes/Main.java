import colors.Color;
import shapes.Circle;
import shapes.Point;
import shapes.Rectangle;
import shapes.Triangle;
import java.util.ArrayList;
import java.util.List;
import service.impl.ShapesServiceImpl;
import java.util.Set;
class Shape extends shapes.Shape {
    // Поля для хранения цвета и координат фигуры
    private Color color;
    private List<Point> points;

    // Конструктор класса Shape
    public Shape(Color color, List<Point> points) {
        this.color = color;
        this.points = points;
    }

    // Метод для получения цвета фигуры
    public Color getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    // Метод для получения координат фигуры
    public List<Point> getPoints() {
        return points;
    }
}

class ShapesService {
    // Метод для вывода информации о фигурах
    public void printShapes(List<Shape> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            Shape shape = shapes.get(i);
            System.out.println("Фигура " + (i+1) + ":");
            System.out.println("Цвет: " + shape.getColor());
            System.out.println("Координаты: " + shape.getPoints());
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // Создание списка фигур
        List<shapes.Shape> shapes = new ArrayList<>();

        Point point_1 = new Point(0, 0);
        Point point_2 = new Point(0, 4);
        Point point_3 = new Point(4, 0);
        Triangle redtriangle = new Triangle(point_1, point_2, point_3);
       redtriangle.setColor(Color.RED);
       redtriangle.draw();


        Point point__1 = new Point(3, 3);
        Circle whitecircle = new Circle(point__1, 1);
        whitecircle.setColor(Color.WHITE);
        whitecircle.draw();

        Point point____1 = new Point(2, 5);
        Circle yellowcircle = new Circle(point____1, 4);
        yellowcircle.setColor(Color.YELLOW);
        yellowcircle.draw();


        Point point___1 = new Point(1, 1);
        Point point___2 = new Point(5, 2);
        Rectangle rectangle_1 = new Rectangle(point___1, point___2);
        rectangle_1.draw();

        Point point123 = new Point (100,100);
        point123.draw();

        Point point11 = new Point(-2, 3);
        Point point22 = new Point(4, 3);
        Point point33 = new Point(2, 5);
        Triangle bluetriangle = new Triangle(point11, point22, point33);
        bluetriangle.setColor(Color.BLUE);
        bluetriangle.draw();

        shapes.add(redtriangle);
        shapes.add(whitecircle);
        shapes.add(yellowcircle);
        shapes.add( rectangle_1);
        shapes.add(point123);
        shapes.add(bluetriangle);
// Создание объекта ShapesServiceImpl
        ShapesServiceImpl shapesService = new ShapesServiceImpl();

        // Вызов методов и вывод результатов на экран
        List<shapes.Shape> shapeList = new ArrayList<>();
        double sumOfSquares = shapesService.getSquares(shapes);
        System.out.println("Сумма площадей фигур: " + sumOfSquares);

        double maxPerimeter = shapesService.getMaxPerimeters(shapes);
        System.out.println("Максимальный периметр фигур: " + maxPerimeter);

        Set<Color> colors = shapesService.getColors(shapes);
        System.out.println("Цвета фигур: " + colors);

        Point point = new Point(2, 1);
        Circle circle = new Circle(point, 1);
        circle.draw();

        circle.setColor(Color.GREEN);
        circle.setPoint(new Point(2, 2));
        circle.move(1, 1);
        circle.draw();


        Point pointA = new Point(2, 2);
        Point pointC = new Point(6, 6);
        Rectangle rectangle2 = new Rectangle(pointA, pointC);
        rectangle2.draw();

        rectangle2.setColor(Color.RED);
        rectangle2.move(1, 1);
        rectangle2.draw();

        Point point1 = new Point(2, 3);
        Point point2 = new Point(5, 5);
        Point point3 = new Point(6, 6);
        Triangle triangle = new Triangle(point1, point2, point3);
        triangle.draw();
    }

}