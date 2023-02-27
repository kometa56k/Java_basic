/*
Напишите программу конвертер валют.
Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
Пример для теста работы программы:
- Курс доллара: 67,55
- Количество рублей: 1000
- Итого: 14,80 долларов
 */
import java.util.IllegalFormatPrecisionException;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите текущий курс доллара:");
        Double course = in.nextDouble();
        System.out.println("Введите количество рублей:");
        int rub = in.nextInt();
        Double result = rub / course;
        System.out.printf("Итого: %.2f долларов",result);
    }
}