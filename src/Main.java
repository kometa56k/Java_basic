/*
Напишите программу:

1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

2. Посчитайте среднее арифметическое элементов массива.

3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        int arrayLength = in.nextInt(); //длина массива
        double[] numericArray = new double[arrayLength]; //объявляем массив
        //заполняем массив значениями, которые вводит пользователь
        for (int i=1;i<=arrayLength;i++) {
            System.out.println("Введите " + i + " значение массива:");
            double num = in.nextDouble();
            numericArray[(i-1)] = num;
        }
        double averageArray = getAverageArray(arrayLength, numericArray);
        System.out.println("Исходный массив: " + Arrays.toString(numericArray));
        System.out.println("Cреднее арифметическое элементов массива равно " + averageArray);
        double[] numericArray2 = getNumericArray2(averageArray,numericArray,arrayLength);
        System.out.println("Массив, умноженный на среднее арифметическое: " + Arrays.toString(numericArray2));
    }
    public static double getAverageArray(int arrayLength, double[] numericArray) {
        double averageArray = 0;
        for (int i=1;i<=arrayLength;i++) {
            averageArray = averageArray + numericArray[(i-1)];
        }
        averageArray = averageArray / arrayLength;
        return averageArray;
    }
    public static double[] getNumericArray2(double averageArray, double[] numericArray,int arrayLength) {
        double[] numericArray2 = new double[arrayLength]; //объявляем массив 2
        for (int i=1;i<=arrayLength;i++) {
            numericArray2[(i-1)] = numericArray[(i-1)] * averageArray;
        }
        return numericArray2;
    }
}