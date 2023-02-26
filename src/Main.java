import java.util.Random;

/*
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
1. Выведите максимальный и минимальный элемент массива.
2. Из максимального и минимального значения выведите наибольшее по модулю.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] array = new double[15]; //объявляем массив
        for (int i = 1; i<=array.length;i++) {
            array[i-1] = -20 + random.nextDouble() * 40;
        }
        System.out.println("Рандомный массив:\n");
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
        //определим максимальный элемент массива
        double maxNum = array[0];
        for (int i=1; i<=array.length; i++) {
            if (array[i-1]>maxNum) {
                maxNum = array[i-1];
            }
        }
        System.out.println("Максимальный элемент массива: " + maxNum);
        //определим минимальный элемент массива
        double minNum = array[0];
        for (int i=1; i<=array.length; i++) {
            if (array[i-1]<minNum) {
                minNum = array[i-1];
            }
        }
        System.out.println("Минимальный элемент массива: " + minNum);
        //определим наибольшее по модулю
        double result = Math.max(Math.abs(minNum),Math.abs(maxNum));
        System.out.println("Наибольшее по модулю: " + result);
    }
}