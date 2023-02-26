/*
Напишите программу:
1. Ввести первое число с клавиатуры и записать его в строковую переменную.
2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
3. Сравнить 2 числа и вывести большее на экран
4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int str1 = in.nextInt();
        String num1 = String.valueOf(str1);
        System.out.println("Введите второе число:");
        int str2 = in.nextInt();
        Integer num2 = Integer.valueOf(str2);
        //сравниваем 2 числа
        if (Integer.valueOf(num1) > num2) {
            System.out.println("Большее число: " + num1);
            double dnum2 = num2;
            System.out.println("Меньшее число: " + dnum2);
        }
        else if (Integer.valueOf(num1) < num2) {
            System.out.println("Большее число: " + num2);
            Double dnum1 = Double.parseDouble(num1);
            System.out.println("Меньшее число: " + dnum1);
        }
        else {
            System.out.println("Числа равны");
        }
    }
}