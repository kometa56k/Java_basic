/*
Напишите простой калькулятор:

1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’

2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.

 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        float x1 = num1(); // ввод первого числа
        float x2 = num2(); // ввод второго числа
        char operation = getOperation(); //вызываем метод getOperation ввода действия над числами
        int result = calc(x1,x2,operation); //вызываем метод calc
        System.out.println("Результат операции: "+result); //выводим результат
    }
    public static float num1(){
        System.out.println("Введите число:");
        float num;
        if(in.hasNextFloat()){
            num = in.nextFloat();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия, заново вызываем метод
            num = num1();
        }
        return num;
    }
    public static float num2(){
        System.out.println("Введите число:");
        float num;
        if(in.hasNextFloat()){
            num = in.nextFloat();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия, заново вызываем метод
            num = num2();
        }
        return num;
    }
    public static char getOperation(){
        System.out.println("Введите действие над числами +,-,* или /:");
        char operation;
        if(in.hasNext()){ //паттерн определяется из совпадений со значениями operation
            operation = in.next().charAt(0); //берём только первый символ
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            in.next();
            operation = getOperation();
        }
        return operation;
    }
    public static int calc(float x1, float x2, char operation){
        float result;
        switch (operation){
            case '+':
                result = x1+x2;
                break;
            case '-':
                result = x1-x2;
                break;
            case '*':
                result = x1*x2;
                break;
            case '/':
                result = x1/x2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(x1, x2, getOperation());//рекурсия
        }
        return (int)result;
    }
}