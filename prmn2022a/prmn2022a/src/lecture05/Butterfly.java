package lecture05;

// 蝶々
// Butterfly → サブクラス、Insect → スーパークラス
public class Butterfly extends Insect {

    // Insect の moveメソッドを再定義
    @Override
    public void move() {
        System.out.println("飛んだよ");
    }
}
