import java.util.Scanner;

class task_1 {

    public static void main(String[] args) {
        String input = inputString();
        reverseString(input);
        everyWordOnNewLine(input);
        replaced(input);
        certainElements(input);
        upperCase(input);
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        return scanner.nextLine();
    }

    public static void reverseString(String line) {
            String reverse = new StringBuffer(line).reverse().toString();
            System.out.print("Reverse input: ");
            System.out.println(reverse + "\n");
    }

    public static void everyWordOnNewLine(String line) {
        String[] subStr;
        String divider = " "; // Разделитель
        subStr = line.split(divider); // Разделения строки subStr с помощью метода split()
        System.out.print("Every word on new line input: " + "\n");
        for (int i = 0; subStr.length > i; i++) {
            System.out.println(subStr[i]);
        }
    }

    public static void replaced(String line) {
        System.out.print("\n" + "Replaced input: ");
        System.out.println(line.replaceAll(" ", "*") + "\n");
    }

    public static void upperCase(String line) {
        String strUpper = line.toUpperCase();
        System.out.print("\n" + "Upper Case input: ");
        System.out.println(strUpper + "\n");
    }

    public static void certainElements(String line) {
        System.out.print("\n" + "From 5th to 10th elements input: ");
        System.out.println(line.substring(5,10));
    }

}