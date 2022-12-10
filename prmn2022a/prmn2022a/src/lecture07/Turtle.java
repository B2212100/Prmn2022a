package lecture07;

// Monster のサブクラス
public class Turtle extends Monster{
    public Turtle() {
        super(new Monster("Turtle", 55, 17, 16, 15, super.skills.add()));
    }
}
