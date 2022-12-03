package lecture06;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

// 課題6-2 ArrayListの範囲外を指定した場合の例外処理
// 課題6-3 標準入力に入力されたものが、int型でない場合の例外処理
public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            integers.add(random.nextInt(6) + 1);
        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("サイコロを5回振りました.\n何回目の値を確認しますか？\n> ");
            int index = scanner.nextInt();
            System.out.println(index + " 回目の値 : " + integers.get(index));
        }
        // int型でないものが入力された場合の例外処理
        catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました.");
        }
        // ArrayListの範囲外を指定した場合の例外処理
        catch (IndexOutOfBoundsException e) {
            System.out.println("Arraylistの範囲外アクセスです.");
        }
        // 必ず最後に行う処理(省略可)
        finally {
            System.out.println("プログラムを終了.");
        }

//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
    }
}
