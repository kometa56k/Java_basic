/*
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getNum();
        int sumNum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sumNum = sumNum + i;
            }
        }
        System.out.println("Сумма всех нечётных чисел от 1 до " + num + " равна " + sumNum);
    }

    public static int getNum() {
        System.out.println("Введите целое положительное число: ");
        int num = in.nextInt();
        if (num > 0) {
            return num;
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num = getNum();
        }
        return num;
    }
}