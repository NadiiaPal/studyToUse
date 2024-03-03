package PR1;

import java.util.ArrayList;

public class Contacts {
    ArrayList<PhoneNumber> numbers = new ArrayList<>();
    ArrayList<String> emails = new ArrayList<>();

    @Override
    public String toString() {
        return "Contacts{" +
                "numbers=" + numbers +
                ", emails=" + emails +
                '}';
    }
}
