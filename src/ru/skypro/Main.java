package ru.skypro;

public class Main {

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args)  {

        int[] arr = generateRandomArray();

//Task1

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей.");

//Task2

        int maxArr = arr[0];
        int minArr = arr[0];

        for (int i : arr) {

            if (minArr > i) {
                minArr = i;
            }
            if (maxArr < i) {
                maxArr = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей");

//Task3

        int averageSum = 0;
        for (int i : arr) {

            sum += i;
            averageSum = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

//Task4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
