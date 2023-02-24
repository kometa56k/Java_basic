/*
Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
Размерность матрицы задается пользователем.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер строки матрицы: ");
        int arrayLength = in.nextInt(); //длина массива
        System.out.println("Введите количество строк матрицы: ");
        int arrayHeight = in.nextInt(); //количество строк массива
        double[][] numericArray = new double[arrayLength][arrayHeight]; //объявляем двухмерный массив
        //заполняем массив значениями, которые вводит пользователь
        for (int i = 1; i <= arrayHeight; i++) { //идём по строкам
            for (int j = 1; j <= arrayLength; j++) { //идём по столбцам
                System.out.println("Введите значение матрицы, строка: " + i + " столбец: " + j);
                double num = in.nextDouble();
                numericArray[(j - 1)][(i - 1)] = num;
            }
        }
        //Получим первую строку матрицы
        double[] oneStringArray = new double[arrayLength]; //объявляем однострочный массив
        for (int j = 1; j <= arrayLength; j++) {
            oneStringArray [(j-1)] = numericArray[j-1][0];
        }
        //Вывод первой строки исходной матрицы на экран
        System.out.println("Первая строка исходной матрицы: " + Arrays.toString(oneStringArray));
        //Вывод первой строки матрицы на экран, умноженный на 3
        for (int i=1;i<=arrayLength;i++) {
            oneStringArray[(i-1)] = oneStringArray[(i-1)] * 3;
        }
        System.out.println("Первая строка матрицы, увеличенная на 3: " + Arrays.toString(oneStringArray));
    }
}