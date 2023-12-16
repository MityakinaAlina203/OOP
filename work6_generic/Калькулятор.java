public class Калькулятор {

    public static <T extends Number,V extends Number> double sum(T x, V y){
        return x.doubleValue()+y.doubleValue();
    }

    public static <T extends Number,V extends Number> double substraction(T x, V y) {
        return x.doubleValue()-y.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
    public static void main(String[] args) {

        Калькулятор a= new Калькулятор();
        System.out.println(a.sum(11,1.4));
        System.out.println(a.divide(15,0));

    }



}