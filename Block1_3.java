import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Block1_3 {

    public static void main(String[] args) {
        // 1. Объявить произвольный массив строк
        String[] mass = {
                "abcqerd", "bcfwk", "dreef", "jklmn", "pjprst",
                "aasfc", "ambn", "kmwk", "jqrbd", "mnjus"
        };

        // 2. Создать коллекцию из массива строк
        ArrayList<String> AL = new ArrayList<String>(mass.length);

        for (int i=0; i<mass.length; i++)
            AL.add(i, mass[i]);

        // 3. Создать поток данных из колекции AL
        Stream<String> stream = AL.stream();

        // 4. Отсортировать поток в естественном порядке (по возрастанию)
        Stream<String> streamSorted = stream.sorted();

        // 5. Отобразить поток streamSorted
        // 5.1. Определить действие, которое будет выводить один элемент потока.
        //      Для этого используется интерфейс Consumer<T>
        Consumer<String> action = (str) -> {
            System.out.println(str);
        };

        // 5.2. Отображить каждый элемент потока
        streamSorted.forEach(action);

        // 6. Отсортировать элементы потока в порядке убывания
        // 6.1. Реализовать компаратор - метод, сравнивающий две строки
        Comparator<String> comparator;

        comparator = (str1, str2) -> {
            return str2.compareTo(str1); // <0, ==0, >0
        };

        // 6.2. Создать новый поток
        stream = AL.stream();

        // 6.3. Отсортировать поток stream
        Stream<String> streamSortedDesc = stream.sorted(comparator);

        // 6.4. Отобразить новый поток
        System.out.println("-----------------------");
        streamSortedDesc.forEach(action);
    }
}