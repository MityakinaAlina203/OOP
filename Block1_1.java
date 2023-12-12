// Задача1. Для любого набора случайно сгенерированных чисел нужно определить количество парных.
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Block1_1 {

    public static void Stream() {

        // случайный массив чисел
        ArrayList<Integer> AL = new ArrayList<Integer>();
        int number;
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            number = rnd.nextInt() % 100;
            AL.add(number);
        }

        System.out.println("Array number:");
        System.out.println(AL);

        // 2. Определить количество парных чисел. Способ 1.
        // 2.1. Создать поток из массива AL - метод stream()
        Stream<Integer> st = AL.stream();

        // 2.2. Объявить ссылку на стандартный
        //      функциональный интерфейс Predicate<Integer>
        Predicate<Integer> fn; // эта ссылка будет передана в метод filter()

        // 2.3. Присвоить ссылке лямбда-выражение, которое определяет есть ли число четным
        fn = (n) -> (n % 2) == 0;

        // 2.4. Вызвать метод filter, который виберет только парные  числа из потока st
        Stream<Integer> resStream = st.filter(fn);

        // 2.5. Вывести количество парных чисел
        System.out.println("col = " + resStream.count());

        // 3. Определить количество парных чисел. Способ 2 - быстрый способ
        int n2 = (int) (AL.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("run = " + n2);
    }
    public static void main(String[] args) {
        Stream();
    }
}
