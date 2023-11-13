package dates;
import java.util.*;

public class MainWar {
    public static void main(String[] args) {
        GregorianCalendar startWar = new GregorianCalendar(1939, 8, 1);
        GregorianCalendar endWar = new GregorianCalendar(1945, 8, 2);
        Date timeOfStart = startWar.getTime(), timeOfEnd = endWar.getTime();
        long timeOfWar = timeOfEnd.getTime() - timeOfStart.getTime();
        System.out.println(timeOfWar/1000/60/60/24);
    }
}
