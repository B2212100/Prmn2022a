package lecture07;

import java.util.Map;
import java.util.function.Supplier;

// 列挙型 複数の定数(列挙子)を一つのクラスとしてまとめられる
// クラスのように扱えるが、インスタンス化できない
public enum MonsterCreator {
    MONKEY,
    PENGUIN,
    TURTLE;

    private int id;
    private Supplier<Monster> supplier;

    private Map<Integer, MonsterCreator>;

    public void viewMonsterList() {

    }

    public int monsterMinId() {

    }

    public int monsterMaxId() {

    }
}
