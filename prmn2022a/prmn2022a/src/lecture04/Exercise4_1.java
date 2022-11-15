package lecture04;

import java.util.Random;    // 乱数を生成するための標準ライブラリ

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100, 30, "Fighter1");
        Fighter fighter2 = new Fighter(150, 50, "Fighter2");

        Random rand = new Random();     // attackのランダム性

        // どちらも生存している限り繰り返す
        while (fighter1.isAlive() && fighter2.isAlive()) {
            int dice = rand.nextInt(2);
            if (dice == 0) {
                fighter1.attack(fighter2);  // fighter1がfighter2をattack
                fighter2.setHitPoint(fighter2.getHitPoint()); // fighter2(攻撃された側)のHPを更新
                System.out.println(fighter2.getName() + " の残り hitPoint : "
                        + fighter2.getHitPoint() + "\n");
            } else {
                fighter2.attack(fighter1);  // fighter2がfighter1をattack
                fighter1.setHitPoint(fighter1.getHitPoint()); // fighter1(攻撃された側)のHPを更新
                System.out.println(fighter1.getName() + " の残り hitPoint : "
                        + fighter1.getHitPoint() + "\n");
            }
        }

        // 勝敗の判定
        if (fighter1.isAlive()) {
            System.out.println("Fighter2は倒れた。");
        } else {
            System.out.println("Fighter1は倒れた。");
        }
    }
}
