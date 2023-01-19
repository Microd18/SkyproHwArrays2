import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание 1");

        int[] arr = generateRandomArray();
        int result = -1;

        for (int a : arr) {
            result += a;
        }

        System.out.println("Сумма трат за месяц составила " + result + " рублей.");
    }

    public static void task2() {
        System.out.println("Задание 2");

        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = -1;

        for (int a : arr) {
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {
        System.out.println("Задание 3");

        int[] arr = generateRandomArray();
        double average = -1;

        for (int a : arr) {
            average += a;
        }

        System.out.printf(String.format(Locale.ROOT, "Средняя сумма трат за месяц составила %.2f рублей. %n", average / arr.length));
    }

    public static void task4() {
        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
