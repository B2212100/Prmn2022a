package lecture07;

// IBattleOutput, IBattleCommand のサブクラス
// BattleMonster のインターフェース
public interface IBattleMonster extends IBattleOutput, IBattleCommand{
    void attack();
}
