package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name) {
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy) {
        if ((enemy.name).equals("Fighter1")) {
            System.out.println(this.name + " は "
                    + enemy.name + " に " + this.power + "ダメージ与えた。");
            enemy.hitPoint -= this.power;
        } else {
            System.out.println(this.name + " は "
                    + enemy.name + " に " + this.power + "ダメージ与えた。");
            enemy.hitPoint -= this.power;
        }
        return;
    }

    public boolean isAlive() {
        return this.hitPoint > 0;   // 生存していればtrue
    }

    public int getHitPoint() {
        return this.hitPoint;   // setHitPointで更新したHPを返す
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
        return;
    }

    public String getName() {
        return this.name;
    }
}
