package lecture07;

// Monster のインターフェース
// BattleMonster のインターフェース
public interface IMonster {
    String getName();
    int getHP();
    void setHP(int hp);
    int getPower();
    int getDefense();
    boolean isAlive();
}
