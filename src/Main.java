public class Main {
    public static void main(String[] args) {
        // Создание и инициализация массива numbers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Вывод исходного массива на экран
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        // Начало операции реверса массива
        for (int i = 0; i < numbers.length / 2; i++) {
            // Использование временной переменной temp для обмена элементами
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        // Вывод массива после реверса на экран
        System.out.println("\nМассив после реверса:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}