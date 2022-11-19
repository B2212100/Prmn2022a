package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();

        String name = "相 上尾";
        String number = "12345";

        // このアカウントは存在するか
        if (atm.existsAccount(name, number)) {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。\n");
        } else {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。\n");
        }

        // アカウントを登録
        atm.registerAccount(name, number);

        // このアカウントは存在するか
        if (atm.existsAccount(name, number)) {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。\n");
        } else {
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。\n");
        }

        // 入金
        atm.deposit(number, 1000);

        // 引き出し(失敗例)
        long zandaka = atm.withdraw(number, 2000);
        System.out.println("残高:" + zandaka + " 円です。\n");

        // 残高表示はここでするべきか

        // 引き出し(成功例)
        zandaka = atm.withdraw(number, 500);
        System.out.println("残高:" + zandaka + " 円です。\n");
    }
}
