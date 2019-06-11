import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_3 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество граней:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= size; i++) {
            draw(i, size);
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            draw(i, size);
            System.out.println();
        }
    }

    static void draw(int i, int size) {
        for (int spaces = 0; spaces < size - i; spaces++) {
            System.out.print(' ');
        }

        System.out.print('*');

        if (i == 1) return;

        for (int spaces = 0; spaces < 2 * i - 3; spaces++) {
            System.out.print(' ');
        }

        System.out.print('*');

    }
}