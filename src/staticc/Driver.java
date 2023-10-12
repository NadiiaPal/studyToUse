package staticc;

public class Driver {
    String name;
    Car car;
    Driver(String name, Car car){
        this.name = name;
        this.car = car;
    }
    void repairCarMyself(){
        car.isBroken = false;
        System.out.println( name + " has repaired his/her car");
    }
}
