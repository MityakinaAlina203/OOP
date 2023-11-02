
public class Main {
    public static void main(String[] args) {

        Vector vector = new Vector(1, 2, 3, 4);
        Vector vector1 = new Vector(1, 2, 3, 4);
        Vector vector2 = new Vector(5, 5, 7, 9);
        double scalarProduct = vector.calculateScalarProduct();
        //double vectorProduct = vector.calculateVectorProduct();
        double vectorLength1 = vector.length1();
        double vectorLength2 = vector.length2();
        Vector sumVector = vector1.calculateSum(vector2);
        Vector difference = vector1.calculateDifference(vector2);



        Vector multipliedVector = vector.multiplyByScalar(2);


        System.out.println("Скалярное произведение: " + scalarProduct);
        //System.out.println("Векторное произведение: " + vectorProduct);
        System.out.println("Длина вектора1: " + vectorLength1);
        System.out.println("Длина вектора2: " + vectorLength2);
        System.out.println("Умноженный вектор1: (" + multipliedVector.getX1() + ", " + multipliedVector.getY1() + ")");
        System.out.println("Умноженный вектор2: (" + multipliedVector.getX2() + ", " + multipliedVector.getY2() + ")");
        System.out.println("Сумма векторов: (" + sumVector.getX1() + ", " + sumVector.getY1() + ", " + sumVector.getX2() + ", " + sumVector.getY2() + ")");
        System.out.println("Разность векторов: (" + difference.getX1() + ", " + difference.getY1() + ", " + difference.getX2() + ", " + difference.getY2() + ")");
    }
    }
