package lecture05;

// バッタ
public class Locust extends Insect {
    // Insect の moveメソッドを再定義

    @Override
    public void move() {
        System.out.println("跳んだよ");
    }
}
