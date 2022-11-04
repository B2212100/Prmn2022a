package lecture02;

public class Car {
    int fuel;

    Car() {
        this.fuel = 0;
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
}
