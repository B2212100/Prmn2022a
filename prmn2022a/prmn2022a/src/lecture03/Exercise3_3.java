package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        // 文字列として受け取った整数をint型に変換し、その和を表示
        Scanner scanner = new Scanner(System.in);

        System.out.print("1つ目の整数を入力してください\n>");
        String input_1 = scanner.nextLine();
        System.out.print("2つ目の整数を入力してください\n>");
        String input_2 = scanner.nextLine();

        // 文字列を整数型に変換
        int in_1 = Integer.parseInt(input_1);
        int in_2 = Integer.parseInt(input_2);

        System.out.println(in_1 + " + " + in_2 + " = " + (in_1 + in_2));
    }
}
