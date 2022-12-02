package lecture06;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

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
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Arraylistの範囲外アクセスです.\nプログラムを終了.");
        }

//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
    }
}
