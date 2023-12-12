import java.util.ArrayList;
import java.util.List;


public class Block2_2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anna");
        names.add("Alice");
        names.add("Bob");
        names.add("Sara");
        names.add("Alla");
        names.add("Ivan");
        names.add("Alex");

        // Приведение всех непустых имен к верхнему регистру
        List<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            if (!name.isEmpty()) {
                uppercaseNames.add(name.toUpperCase());
            }
        }

        // Вывод приведенных имен
        System.out.println("Имена в верхнем регистре:");
        for (String name : uppercaseNames) {
            System.out.println(name);
        }

        // Подсчет количества имен, начинающихся с определенной буквы
        char targetLetter = 'A';
        int count = 0;
        for (String name : names) {
            if (!name.isEmpty() && name.charAt(0) == targetLetter) {
                count++;
            }
        }

        // Вывод результата подсчета
        System.out.println("Количество имен, начинающихся с буквы " + targetLetter + ": " + count);
    }
}