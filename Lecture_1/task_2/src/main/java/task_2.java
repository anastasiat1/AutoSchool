import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class task_2 {

    public static void main(String[] args) throws IOException {

                System.out.println("Введите номер дня недели:");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int day = Integer.parseInt(reader.readLine());
                switch (day) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    default:
                        System.out.println("Ошибка! Такого дня недели не существует");
                        break;
                }
            }
        }