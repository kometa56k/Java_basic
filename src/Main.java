/*
Написать программу, которая будет выполнять следующие действия:

1. Ввести три числа с клавиатуры x, y, z

2. Найти и вывести в консоль среднее арифметическое этих чисел

3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону

4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число х:");
        float x = in.nextFloat();
        System.out.println("Введите число y:");
        float y = in.nextFloat();
        System.out.println("Введите число z:");
        float z = in.nextFloat();
        float SrNum = (x+y+z)/3;
        System.out.println("Среднее арифметическое равно: " + SrNum);
        float SrNum2 = SrNum/=2;
        if (Math.floor(SrNum2) > 3.0) {
            System.out.println("Программа выполнена корректно");
        }
        else
            System.out.println("Результат равен или меньше 3: " + Math.floor(SrNum2));
        }
    }