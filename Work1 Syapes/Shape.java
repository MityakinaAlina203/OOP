package shapes;

import colors.Color;

public abstract class Shape {





        private Color color = Color.TRANSPARENT;

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        public abstract double getArea();

        public abstract double getPerimeter();

        public void move(double moveX, double moveY) {
            // Перемещение фигуры
        }

        public void draw() {
            System.out.println("Название фигуры: " + getClass().getSimpleName());
            System.out.println("Цвет: " + color);
            System.out.println("Координаты точек:");
            // Вывод координат точек фигуры
            System.out.println("Площадь: " + getArea());
            System.out.println("Периметр: " + getPerimeter());
        }
    }

