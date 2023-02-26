/*
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
1. Выведите слова, состоящие только из латиницы.
2. Выведите количество этих слов.
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите строку, например: I love java 8 Я люблю java 14 core1");
        String result = in.nextLine();
        System.out.println(result);
        String[] masresult = result.split(" ");
        int lengthmas = masresult.length;
        System.out.println("Общее количество слов: " + lengthmas);
        String result2 = result.replaceAll("[А-Яа-я0-9]","");//удалим слова с кириллицей и цифры
        result2 = result2.replaceAll("[\\s]{2,}"," ");//удалим лишние пробелы
        System.out.println(result2);//выводим результат
        String[] masresult2 = result2.split(" ");//назначаем массив из строки
        int lengthmas2 = masresult2.length;
        System.out.println("Общее количество слов из латиницы: " + lengthmas2);
    }
}