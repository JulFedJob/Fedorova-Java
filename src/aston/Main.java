package aston;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 целых числа:");
        comparingNumbers(sc.nextInt(), sc.nextInt());

        System.out.println();

        System.out.println("Введите 2 строки:");
        comparingString(sc.next(), sc.next());

        System.out.println();

        evenNumbers();
    }

     static void comparingNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println();
        System.out.println("Сложение: " + a + " + " + b + " = " + (a + b));
        System.out.println("Вычитание: " + a + " - " + b + " = " + (a - b));
        System.out.println("Умножение: " + a + " * " + b + " = " + (a * b));
        System.out.println("Деление: " + a + " / " + b + " = " + (a / b));
    }

    static void comparingString(String a, String b) {
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    static void evenNumbers() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
