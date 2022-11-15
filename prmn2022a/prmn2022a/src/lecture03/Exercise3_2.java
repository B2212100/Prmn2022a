package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        // 何行分の文字列を入力するか
        System.out.print("何行分入力しますか？\n>");
        int how_many_lines = scanner.nextInt();
        scanner.nextLine(); // 改行コードを空読み

        // 指定された行数分入力
        for (int i = 0; i < how_many_lines; i++) {
            System.out.print((i + 1) + "行目:\n>");
            strings.add(scanner.nextLine());
        }

        // 入力した文字列を表示(拡張for文)
        int j = 0;
        System.out.println("\n入力した文字列:");
        for (String string : strings) {
            System.out.println("[" + j + "]" + string);
            j++;
        }

    }
}
