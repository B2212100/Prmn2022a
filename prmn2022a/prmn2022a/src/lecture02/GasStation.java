package lecture02;

public class GasStation {
    void refuel(Car car) {
        car.fuel += 20;
        System.out.println("燃料が 20 給油されました");
        return;
    }
}
