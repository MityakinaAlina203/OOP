// Задача2. Задано множество фамилий сотрудников.Разработать программу, которая отображает все фамилии, начинающиеся на букву 'J'
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Block1_2 {

    public static void DemoStream() {


        // 1. Организовать ввод фамилий с з клавиатуры.
        //    Конец ввода - пустая строка ""
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> surname = new ArrayList<String>();

        System.out.println("Enter surnames: ");
        while (true) {
            System.out.print("surname = ");
            s = scanner.nextLine();
            if (s.equals("")==true)
                break;
            surname.add(s);
        }
        System.out.println();

        // 2. Вывести массив введенных фамилий
        System.out.println("Surname = " + surname);

        // 3. Вычислить количество фамилий, которые начинаются на 'J'
        // 3.1. Объявить ссылку на функциональный интерфейс Predicate<T>
        Predicate<String> fn;

        // 3.2. Установить лямбда-выражение для fn
        fn = (str) -> {
            if (str.charAt(0)=='J')
                return true;
            return false;
        };

        // 3.3. Конвертировать AL в поток строк
        Stream<String> stream = surname.stream();

        // 3.4. Получить отфильтрованный поток согласно предикату,
        //      определенному в fn()
        Stream<String> resStream = stream.filter(fn);

        // 3.5. Вывести количество фамилий, начинающихся на J
        System.out.println("col = " + resStream.count());
    }

    public static void main(String[] args) {
        DemoStream();
    }
}