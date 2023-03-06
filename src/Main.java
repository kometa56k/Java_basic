/*
Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
Ответ: “Заархивированный вирус”.
1. У пользователя есть 3 попытки, чтобы отгадать загадку.
2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны. Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.
6. Если пользователь, использовавший подсказку, ошибется,
вывести “Обидно, приходи в другой раз” и завершить работу.
*/
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean check = false;
        int i = 1;
        String hint = "Подсказка";
        String answer = "Заархивированный вирус";
        System.out.println("Отгадайте загадку: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        for (i = 1; i <= 3; i++) {
            String inputAnswer = in.nextLine();
            if (inputAnswer.compareTo(answer) == 0) {
                check = true;
                break;
            } else if (inputAnswer.compareTo(hint) == 0) {
                System.out.println("Опасная программа");
                i++;
            } else {
                System.out.println("Подумай еще!");
            }
            }
        if (check) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}