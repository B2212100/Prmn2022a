package lecture07;

// IBattleMonster の実装クラス
// Monster のサブクラス
// IMonster の実装クラス
// EnemyMonster, PlayerMonster のスーパークラス
// 抽象クラス 処理内容が確定していないクラス(メソッド)
public abstract class BattleMonster extends Monster implements IBattleMonster, IMonster{
    protected BattleMonster(IMonster monster) {

    }

    public void attack(int skillIndex, IMonster opponent) {

    }

    protected void receiveDamage(int damage, IMonster opponent) {

    }
}
