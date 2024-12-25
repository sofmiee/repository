import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maxim {

    public static Integer findMinimum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        return numbers.stream().min(Integer::compareTo).orElse(null);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int count = scanner.nextInt();

        List<Integer> numbersList = new ArrayList<>();

        System.out.println("Введите " + count + " целых чисел:");
        for (int i = 0; i < count; i++) {
            System.out.print("Элемент " + (i + 1) + ":");
            int number = scanner.nextInt();
            numbersList.add(number);
        }

        Integer minValue = findMaximum(numbersList);
        System.out.println("Минимальное значение: " + minValue);

        scanner.close();
    }
}
