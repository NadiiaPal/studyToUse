package staticc;

public class Station {
    static void repairingCarInStation(Driver d){
        d.car.isBroken = false;
        System.out.println("The station has repaired car");
    }
}
