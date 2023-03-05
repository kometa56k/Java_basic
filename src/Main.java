/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.

Пример для теста работы программы:
Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите количество строк: ");
        int countStr = in.nextInt();
        String[] str = new String[countStr]; //массив строк
        Scanner in2 = new Scanner(System.in);

        for (int i=1; i<=countStr; i++) {
            System.out.println("Введите строку № " + (i));
            str[i-1] = in2.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println("Строка " + (i+1) + ": " + str[i]);
        }

        int[] count = new int[countStr]; //массив длины строк
        for(int i = 0; i < str.length; i++){ //проходим по каждой строке массива
            for(int j = i; j < str[i].length(); j++){ //проходим по каждому символу строки
                char temp = ' '; //объявляем переменную для сравнения и присваиваем ей первое значение - пробел.
                for(int z = j; z < str[i].length(); z++){ //счетчик, в кт текущий символ j сравнивается с каждым символом z в данной строке
                    if(str[i].charAt(j)!=str[i].charAt(z) && temp != str[i].charAt(z)){ //если текущий символ не равен следующему символу то делаем count[]++
                        temp = str[i].charAt(z);
                        count[i]++;
                    }

                }
            }
        }
        int max = 0;
        String answer = "";
        for(int i = 0; i < count.length; i++){
            //Ищем строку с максимальной длиной различных символов и если второй больше первого сохраняем строку
            if(max <= count[i]){
                max = count[i];
                answer = str[i];
            }
        }

        System.out.println("Ответ: " + answer);

    }
}

