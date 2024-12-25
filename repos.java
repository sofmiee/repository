import java.util.List;

public class maxim {

    public static Integer findMaximum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) { // Проверка на пустой или null список
            return null; // Возвращаем null, если список пустой
        }

        int maximum = numbers.get(0); // Инициализируем максимум первым элементом списка
        for (int number : numbers) {
            if (number > maximum) { // Если текущий элемент больше максимума
                maximum = number; // Обновляем максимум
            }
        }
        return maximum; // Возвращаем найденный максимум
    }

    public static void main(String[] args) {
        List<Integer> numbersList = List.of(3, 5, 1, 8, 2);
        Integer maxValue = findMaximum(numbersList);
        System.out.println("Максимальное значение: " + maxValue);
    }
}
