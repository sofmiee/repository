import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maxim {

    public static Integer findMaximum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        return numbers.stream().max(Integer::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int count = scanner.nextInt();

        List<Integer> numbersList = new ArrayList<>();

        System.out.println("Введите " + count + " целых чисел:");
        for (int i = 0; i < count; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbersList.add(number);
        }

        Integer maxValue = findMaximum(numbersList);
        System.out.println("Максимальное значение: " + maxValue);

        scanner.close();
    }
}
