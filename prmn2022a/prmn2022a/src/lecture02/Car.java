package lecture02;

public class Car {
    int fuel;

    // 課題3
    Tire[] tires;
    Engine engine;

    Car(Tire[] tires, Engine engine) {
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void run() {
        if (this.fuel <= 0) {
            System.out.println("燃料がありませんでした");
        } else {
            this.fuel--;
            System.out.println("燃料が 1 消費されました");
        }
        System.out.println("fuel = " + this.fuel);
        return;
    }

    void startEngine() {
        this.engine.start();
    }
}
