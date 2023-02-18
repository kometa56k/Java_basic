/*
Напишите программу конвертер физических величин:

1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
 */
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int type1 = getType(); //вызываем метод выбора массы или расстояния
        int type2 = getUnit(); //вызываем метод выбора единицы измерения
        int num = getNum(); //вызываем метод ввода количества выбранных единиц
        // Создаем объект класса
        Main result = new Main();
        // Вызываем метод
        result.calc(type1,type2,num);
    }
    public static int getType(){
        System.out.println("Выберите что переводить: \n 1-масса \n 2-расстояние");
        int type = in.nextInt();
        if (type == 1) {
            System.out.println("Выберите единицу измерения: \n1 - кг, \n2 - грамм, \n3 - фут, \n4 - карат");
        }
        else if (type == 2) {
            System.out.println("Выберите единицу измерения: \n1 - метр, \n2 - миля, \n3 - ярд, \n4 - фут");
        }
        else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия, заново вызываем метод
            type = getType();
        }
        return type;
    }
    public static int getUnit(){
        int unit = in.nextInt();;
            if (unit > 0 && unit < 5){
                System.out.println("Введите число: ");
            }
            else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия, заново вызываем метод
            unit = getUnit();
        }
        return unit;
    }
    public static int getNum(){
        int x;
        if (in.hasNextInt()){ //если true
            x = in.nextInt(); //берём первое число в строке
        }
        else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            in.next();//рекурсия, заново вызываем метод
            x = getNum();
        }
        return x;
    }
    public static void calc(int type1,int type2,int num){
        if (type1 == 1){
            double kilogram = 0;
            double gram = 0;
            double lb = 0;
            double carat = 0;

            switch (type2) {
                case 1:
                    kilogram = num;
                    gram = num * 1000;
                    lb = num * 2.2046223302272;
                    carat = num * 5000;
                    break;
                case 2:
                    kilogram = num / 1000;
                    gram = num;
                    lb = num / 453.592;
                    carat = num * 5;
                    break;
                case 3:
                    kilogram = num / 2.205;
                    gram = num * 453.592;
                    lb = num;
                    carat = num * 2267.962;
                    break;
                case 4:
                    kilogram = num / 5000;
                    gram = num / 5;
                    lb = num / 2267.962;
                    carat = num;
                    break;
            }
            System.out.println("Результат: \n килограмм = " + kilogram + "\n грам = " + gram + "\n фут = " + lb + "\n карат = " + carat);
        }
        else {
            double meter = 0;
            double mile = 0;
            double yard = 0;
            double foot = 0;

            switch (type2) {
                case 1:
                    meter = num;
                    mile = num / 1609.34;
                    yard = num * 1.094;
                    foot = num * 3.281;
                    break;
                case 2:
                    meter = num * 1609.34;
                    mile = num;
                    yard = num * 1760;
                    foot = num * 5280;
                    break;
                case 3:
                    meter = num / 1.094;
                    mile = num / 1760;
                    yard = num;
                    foot = num * 3;
                    break;
                case 4:
                    meter = num / 3.281;
                    mile = num / 5280;
                    yard = num / 3;
                    foot = num;
                    break;
            }
            System.out.println("Результат: \n метр = " + meter + "\n миля = " + mile + "\n ярд = " + yard + "\n фут = " + foot);
        }
    }
}