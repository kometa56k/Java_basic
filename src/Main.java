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
        int n = 1;
        String hint = "Подсказка";
        String answer1 = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        System.out.println("Отгадайте загадку: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        int answer = getAnswer(answer1,hint,n);
        if (answer == 1) {
            System.out.println("Правильно!");
        }
        else {
            System.out.println("Обидно, приходи в другой раз");
        }
    }
    public static int getAnswer(String answer1, String hint, int n) {
            int answer = 0;
            String answer2 = in.nextLine();
            if (answer2.compareTo(answer1) == 0) {
                answer = 1;
            }
            else if (answer2.compareTo(hint) == 0 && n = 1) {
                System.out.println("Это горький овощ");
                n = n + 2;
                answer = getAnswer();
            }
            else if (answer2.compareTo(answer1) != 0 && n = 1) {
                System.out.println("Подумай еще!");
                n = n + 1;
                answer = getAnswer();
            }
            else if (answer2.compareTo(answer1) != 0 && n = 2) {
                System.out.println("Подумай еще!");
                n = n + 1;
                answer = getAnswer();
            }
            else (answer2.compareTo(answer1) != 0 && n = 3) {
                answer = 0;
            }
            return answer;
    }
}