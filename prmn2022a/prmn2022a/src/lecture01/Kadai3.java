package lecture01;

import java.util.Scanner;

public class Kadai3 {
    public static void main(String[] args) {
        // ageの値が20以上か(成人しているか)を判定
        Scanner input = new Scanner(System.in);
        System.out.print("年齢を入力\nage = ");
        int age = input.nextInt();

        if (age < 20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor.");

        } else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }
    }
}
