/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите строку: I like Java!!!");
        String result = in.nextLine();
        if (result.contains("Java")) {
            if (result.startsWith("I like")) {
                if (result.endsWith("!!!")) {
                    String result1 = result.toUpperCase();
                    result = result.replaceAll("a","o");
                    System.out.println(result1);
                    System.out.println(result.substring(7,11));
                }
            }
        }
    }
}