package lecture05;

// アゲハ蝶
public class SwallowtailButterfly extends Butterfly {
    // Butterfly の moveメソッドを再定義

    @Override
    public void move() {
        System.out.println("綺麗に飛んだよ");
    }
}
