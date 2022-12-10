package lecture07;

import java.util.ArrayList;
import java.util.List;

// IMonster の実装クラス
// Skill との多重度1~3
// Monkey, Penguin, Turtle のスーパークラス
// BattleMonster のスーパークラス
public class Monster implements IMonster {
    // フィールド変数
    private String name;
    private HP hp;  // HPクラスに依存
    private int power;
    private int defense;
    private int speed;
    private List<Skill> skills = new ArrayList<>();

    // コンストラクタ
    protected Monster(String name, int hp, int power, int defense, int speed, List<Skill> skills) {
        this.name = name;
        setHp(hp);
        this.power = power;
        this.defense = defense;
        this.speed = speed;

    }

    protected Monster(IMonster monster) {

    }

    // フィールド変数のゲッター
    public String getName() {
        return this.name;
    }

    public int getHP() {
        return this.hp;
    }

    // フィールド変数 hp のセッター
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return this.power;
    }

    public int getDefense() {
        return this.defense;
    }

    // hp がなくなっていないか判断
    public boolean isAlive() {
        return getHP() > 0;
    }
}
