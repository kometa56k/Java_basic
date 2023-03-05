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
        String[] str = new String[countStr];
        Scanner in2 = new Scanner(System.in);

        for (int i=1; i<=countStr; i++) {
            System.out.println("Введите строку № " + (i));
            str[i-1] = in2.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println("Строка " + (i) + ": " + str[i]);
        }
        //Создаем массив для того чтобы сохранять длину строк
        int[] count = new int[countStr];
        //Проходим по элементам массива str
        for(int i = 0; i < str.length; i++){
            //Сохранить текущий символ
            for(int j = i; j < str[i].length(); j++){
                char temp = ' ';
                //Текущий символ сравнивается с каждым символом в данной строке
                for(int z = j; z < str[i].length(); z++){
                    //Если текущий символ не равен следующему символу то делаем count[]++
                    if(str[i].charAt(j)!=str[i].charAt(z) && temp != str[i].charAt(z)){
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

