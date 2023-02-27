/*
Напишите программу, которая позволит решить простое уравнение относительно x.
Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
Нужно найти неизвестное.
Пример для теста работы программы:
- Ввод: x+5=7
- Вывод: 2
- Ввод: 3-x=9
- Вывод: -6
- Ввод: 3-3=x
- Вывод: 0
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String equation = getEquation();
        //разобъем строку на переменные
        String x1 = equation.substring(0,1);
        String operation = equation.substring(1,2);
        String x2 = equation.substring(2,3);
        String x3 = equation.substring(4,5);
        int result = getResult(x1,x2,x3,operation);
        System.out.println("Вывод: " + result);

    }
    public static String getEquation() {
        System.out.println("Введите уравнение длиной 5 символов:");
        String equation = in.nextLine();
        if (equation.length() == 5) {
            return equation;
            }
        else {
            System.out.println("Вы допустили ошибку при вводе уравнения. Попробуйте еще раз.");
            equation = getEquation();
        }
        return equation;
    }
    public static int getResult(String x1,String x2,String x3,String operation) {
        int result = 0;
        if (x3.compareTo("x") == 0) {
            switch (operation){
                case "+":
                    result = Integer.valueOf(x1)+Integer.valueOf(x2);
                    break;
                case "-":
                    result = Integer.valueOf(x1)-Integer.valueOf(x2);
                    break;
            }
        }
        else if (x1.compareTo("x") == 0) { //x+5=7
            switch (operation){
                case "+":
                    result = Integer.valueOf(x3)-Integer.valueOf(x2);
                    break;
                case "-":
                    result = Integer.valueOf(x3)+Integer.valueOf(x2);
                    break;
            }
        }
        else if (x2.compareTo("x") == 0) { //3-x=9
            switch (operation){
                case "+":
                    result = Integer.valueOf(x3)-Integer.valueOf(x1);
                    break;
                case "-":
                    result = Integer.valueOf(x1)-Integer.valueOf(x3);
                    break;
            }
        }
        else {
            System.out.println("Операция не распознана");
        }
        return result;
    }
}

