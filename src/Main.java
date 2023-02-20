/*
Напишите программу:

1. Пользователь вводит размер массива и данные с клавиатуры в массив

2. Сравнить элементы массива с заранее заданными константами x, y, z.

3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 15;
        int y = 21;
        int z = 48;
        System.out.println("Введите размер массива: ");
        int arrayLength = in.nextInt(); //длина массива
        int[] numericArray = new int[arrayLength]; //объявляем массив
        //заполняем массив значениями, которые вводит пользователь
        for (int i=1;i<=arrayLength;i++) {
            System.out.println("Введите " + i + " значение массива:");
            int num = in.nextInt();
            numericArray[(i-1)] = num;
        }
        //перебираем массив и сравниваем с константами
        for (int i=1;i<=arrayLength;i++) {
            if (numericArray[i-1] == x || numericArray[i-1] == y || numericArray[i-1] == z) {
                System.out.println("Данное значение " + numericArray[i-1] + " имеется в константах");
            }
        }
    }
}