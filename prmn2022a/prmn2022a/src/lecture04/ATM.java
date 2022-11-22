package lecture04;

import java.util.List;
import java.util.ArrayList;

public class ATM {

    // AccountはATMに集約
    private List<Account> accountList = new ArrayList<>();

    // コンストラクタ
    public ATM() {
        List<Account> accountList = new ArrayList<>();
    }

    public void registerAccount(String name, String number) {
        // アカウントを登録
        accountList.add(new Account(name, number));
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。\n");
        return;
    }

    public boolean existsAccount(String name, String number) {
        // 引数のname,numberから、accountListに存在するかを返す
        // 拡張for文
        for (Account account1 : accountList) {
            if (account1.getName().equals(name) && account1.getNumber().equals(number)) {
                return true;
            }
        }   // containsメソッドは、文字列がオブジェクトに含まれていなく、うまくいかなかった
        return false;
    }

    public void deposit(String number, long money) {
        // 引数のnumberが存在するなら入金

        for (Account account1 : accountList) {
            if (account1.getNumber().equals(number)) {
                System.out.println("口座番号:" + number + " に " + money + " 円 入金しました。\n");
                account1.setSumBalance(money);
                return;
            }
        }
        System.out.println("入金されませんでした。\n");
        return;
    }

    public long withdraw(String number, long money) {
        // 引数のnumberが存在するなら引出
        // ただし、残高が足りない場合は行えない

        for (Account account1 : accountList) {
            if (account1.getNumber().equals(number)) {
                if (account1.getBalance() > money) {
                    System.out.println("口座番号:" + number + " から " + money + " 円 引き出しました。");
                    account1.setDifBalance(money);

                } else {
                    System.out.println("口座番号:" + number + " から " + money + " 円 引き出せませんでした。");
                }
                return account1.getBalance();
            }
        }

        System.out.println("口座番号:" + number + " は存在しません。\n");
        return 0;
    }
}
