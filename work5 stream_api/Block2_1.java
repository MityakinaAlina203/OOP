import java.util.List;
import java.util.stream.Collectors;

    public class Block2_1 {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
            List<Integer> evenNumbers = findEvenNumbers(numbers);
            System.out.println("Четные числа " + evenNumbers);
        }

        public static List<Integer> findEvenNumbers(List<Integer> numbers) {
            return numbers.stream()
                    .filter(number -> number % 2 == 0)
                    .collect(Collectors.toList());
        }
    }

