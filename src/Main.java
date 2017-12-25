import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // prog — число созданное программой
        // user — число введённое пользователем
        int prog, user;
        int count=0;
        // Генерируем случайное целое число от 1 до 10
        do {
            prog = (int) (Math.random() * 21) - 10;
        } while (prog == 0);

        System.out.println("Я загадала число от -10 до 10, отгадайте его.");
        System.out.print("Вводите ваше число: ");
        Scanner input = new Scanner(System.in);
        // Проверяем, есть ли в потоке ввода целое число
        if( input.hasNextInt() ) {
            do {
                // Читаем с потока ввода целое число
                user = input.nextInt();
                if(user == prog) {
                    System.out.println("Вы угадали!");
                    count++;
                    System.out.println("Количество попыток равно "+count);
                } else {
                    // Проверяем, входит ли число в отрезок [-10;10]
                    if (user > -10 && user <= 10) {
                        System.out.println("Вы не угадали! ");
                        // Если число загаданное программой меньше...
                        if( prog < user ) {
                            if (prog < 0 && user > 0) {
                                System.out.println("ошибся в знаке");
                            }
                            count++;
                            System.out.println("Моё число меньше.");
                        } else {
                            if (prog > 0 && user < 0) {
                                System.out.println("ошибся в знаке");
                            }
                            count++;
                            System.out.println("Моё число больше.");
                        }
                    } else {
                        System.out.println("Ваше число вообще не из нужного отрезка!");
                    }
                }
            } while( user != prog );
        } else {
            System.out.println("Ошибка. Вы не ввели целое число!");
        }
        System.out.println("До свиданья!");
    }
}