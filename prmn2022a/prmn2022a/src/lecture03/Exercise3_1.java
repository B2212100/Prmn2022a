package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("入力された文字列を出力\n任意の文字列を入力してください\n> ");
        String input = scanner.nextLine();

        System.out.println("\n'" + input + "'と入力されました");
    }
}
