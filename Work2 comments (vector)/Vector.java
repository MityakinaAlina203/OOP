/**<b>Примечание:<b/>
 * @author Alina Mityakina
 * @version 1.0
 * @since 2023 - 10 -14
 *
 */


/**
 * Класс Vector представляет двумерный вектор в пространстве.
 */
public class Vector {
    /**
     * Координата x1 вектора.
     */
    double x1;

    /**
     * Координата y1 вектора.
     */
    double y1;

    /**
     * Координата x2 вектора.
     */
    double x2;

    /**
     * Координата y2 вектора.
     */
    double y2;

    /**
     * Конструктор с параметрами.
     *
     * @param x1 Координата x1 вектора.
     * @param y1 Координата y1 вектора.
     * @param x2 Координата x2 вектора.
     * @param y2 Координата y2 вектора.
     */
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Конструктор без параметров.
     * Устанавливает начальные значения координат вектора равными 0.
     */
    public Vector() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    }

    /**
     * Получает значение координаты x1 вектора.
     *
     * @return Значение координаты x1 вектора.
     */
    public double getX1() {
        return x1;
    }

    /**
     * Устанавливает значение координаты x1 вектора.
     *
     * @param x1 Новое значение координаты x1 вектора.
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }
    /**
     * Возвращает значение координаты y1 начальной точки вектора
     * @return Значение координаты y1 начальной точки вектора
     */
    public double getY1() {
        return y1;
    }
    /**
     * Устанавливает значение координаты y1 начальной точки вектора
     * @param y1 Новое значение координаты y1 начальной точки вектора
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }
    /**
     * Возвращает значение координаты x2 конечной точки вектора
     * @return Значение координаты x2 конечной точки вектора
     */
    public double getX2() {
        return x2;
    }
    /**
     * Устанавливает значение координаты x2 конечной точки вектора
     * @param x2 Новое значение координаты x2 конечной точки вектора
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    /**
     * Возвращает значение координаты y2 конечной точки вектора
     * @return Значение координаты y2 конечной точки вектора
     */
    public double getY2() {
        return y2;
    }
    /**
     * Устанавливает значение координаты y2 конечной точки вектора
     * @param y2 Новое значение координаты y2 конечной точки вектора
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }


    //метод для нахождения векторного произведения
  /*  public double calculateVectorProduct() {
        return x1 * y2 - y1 * x2;
    }*/

    // метод для нахождения скалярного произведения

    /**
     * Вычисляет скалярное произведение векторов
     * @return Скалярное произведение векторов
     */
    public double calculateScalarProduct() {
        return x1 * x2 + y1 * y2;

    }


    // метод для нахождения длины вектора
    /**
     * Вычисляет длину первого вектора
     * @return Длина первого вектора
     */
    public double length1() {
        double length1 = Math.sqrt(x1 * x1 + y1 * y1);
        return length1;
    }
    /**
     * Вычисляет длину второго вектора
     * @return Длина второго вектора
     */
    public double length2() {
        double length2 = Math.sqrt(x2 * x2 + y2 * y2);
        return length2;
    }


    // метод для умножения вектора на число
    /**
     * Умножает вектор на заданное число
     * @param scalar Число, на которое умножается вектор
     * @return Вектор, умноженный на заданное число
     */
    public Vector multiplyByScalar(double scalar) {
        return new Vector(x1 * scalar, y1 * scalar, x2 * scalar, y2 * scalar);
    }

    // метод для нахождения суммы векторов
    /**
     * Вычисляет сумму двух векторов
     * @param otherVector Второй вектор, с которым выполняется суммированиеjavadoc ./src/Vector.java
     * @return Вектор, являющийся суммой двух векторов
     */
    public Vector calculateSum(Vector otherVector) {
        double sumX = this.x1 + otherVector.x1;
        double sumY = this.y1 + otherVector.y1;
        double sumX2 = this.x2 + otherVector.x2;
        double sumY2 = this.y2 + otherVector.y2;

        return new Vector(sumX, sumY, sumX2, sumY2);
    }

    //метод для нахождения разности векторов
/**
 * Вычисляет разность двух векторов
 * @param otherVector Второй вектор, с которым выполняется вычитание
 * @return Вектор, являющийся разностью двух векторов
 *      */
    public Vector calculateDifference(Vector otherVector) {
        double diffX = this.x1 - otherVector.x1;
        double diffY = this.y1 - otherVector.y1;
        double diffX2 = this.x2 - otherVector.x2;
        double diffY2 = this.y2 - otherVector.y2;

        return new Vector(diffX, diffY, diffX2, diffY2);


    }
}