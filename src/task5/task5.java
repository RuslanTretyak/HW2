package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i > 0) {
                int result = 0;
                for (int j = 1; j < i; j++) {
                    result += j;
                }
                System.out.println("сумма чисел от 1 до введенного числа " + i + " равна " + result);
            } else {
                System.out.println("введенное число не является положительным");
            }
        } else {
            System.out.println("введенные данные на являются целым числом");
        }
    }
}
