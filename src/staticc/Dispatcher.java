package staticc;

public class Dispatcher {
    public static void main(String[] args) {
        Car bmw = new Car("bmw m5", 2019, true);
        Driver ownerBMW = new Driver("Mark", bmw);
        ownerBMW.repairCarMyself();
        bmw.isBroken = true;
        Station.repairingCarInStation(ownerBMW);
    }
}

