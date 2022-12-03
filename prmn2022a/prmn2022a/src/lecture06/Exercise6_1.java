package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

// 課題6-1 想定される値が入力されなかった場合の例外処理
public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("小数値を入力してください:\n> ");

        try {
            double input = scanner.nextDouble();
            System.out.println("input = " + input);
        } catch (InputMismatchException e) {
            System.out.println("エラー.");
        }
    }
}
