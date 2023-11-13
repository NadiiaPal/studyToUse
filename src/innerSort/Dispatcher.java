package innerSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dispatcher {
    public static void main(String[] args) {
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("Alex", "Ukraine", 2005, true));
        p.add(new Person("Rob", "UK", 2005, true));

        p.add(new Person("Mary", "Italy", 2001, false));
        p.add(new Person("Alex", "Ukraine", 2005, false));

        p.add(new Person("Max", "Poland", 2008, true));
        p.add(new Person("July", "Italy", 2000, false));

        Person.sortPersons(p, "1");
        for (Person temp : p) {
            System.out.println(temp);
        }
    }
}

class Person implements Comparable{
    static class ComparatorByRegion implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            int result = ((Person)o1).region.compareTo(((Person)o2).region);
            if(result != 0){
                return result;
            }else {
                result = ((Person)o1).name.compareTo(((Person)o2).name);
                if(result != 0){
                    return result;
                }else {
                    if((((Person)o1).isMale && ((Person)o2).isMale) || (!((Person)o1).isMale && !((Person)o2).isMale)){
                        result = 0;
                    } else if (!((Person)o1).isMale && ((Person)o2).isMale) {
                        result = 1;
                    }else {
                        result = -1;
                    }
                    if(result != 0){
                        return result;
                    }else {
                        return ((Person)o1).birthYear - ((Person)o2).birthYear;
                    }
                }
            }
        }
    }
    static class ComparatorByBirthYear implements Comparator{//old -> young
        @Override
        public int compare(Object o1, Object o2) {
            int result = ((Person)o1).birthYear - ((Person)o2).birthYear;
            if(result != 0){
                return result;
            }else {
                if((((Person)o1).isMale && ((Person)o2).isMale) || (!((Person)o1).isMale && !((Person)o2).isMale)){
                    result = 0;
                } else if (!((Person)o1).isMale && ((Person)o2).isMale) {
                    result = 1;
                }else {
                    result = -1;
                }
                if(result != 0){
                    return result;
                }else {
                    result = ((Person) o1).name.compareTo(((Person) o2).name);
                    if (result != 0) {
                        return result;
                    } else {
                        return ((Person) o1).region.compareTo(((Person) o2).region);
                    }
                }
            }
        }
    }
    static class ComparatorByGender implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            int result;
            if((((Person)o1).isMale && ((Person)o2).isMale) || (!((Person)o1).isMale && !((Person)o2).isMale)){
                result = 0;
            } else if (!((Person)o1).isMale && ((Person)o2).isMale) {
                result = 1;
            }else {
                result = -1;
            }
            if(result != 0){
                return result;
            }else {
                result = ((Person) o1).name.compareTo(((Person) o2).name);
                if (result != 0) {
                    return result;
                } else {
                    result = ((Person) o1).region.compareTo(((Person) o2).region);
                    if(result != 0){
                        return result;
                    }else {
                        return ((Person)o1).birthYear - ((Person)o2).birthYear;
                    }
                }
            }
        }
    }

    String name;
    String region;
    int birthYear;
    boolean isMale;

    public Person(String name, String region, int birthYear, boolean isMale) {
        this.name = name;
        this.region = region;
        this.birthYear = birthYear;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Person: " + this.name + " " + this.region + " " + this.birthYear + " " + this.isMale;
    }
    public static void sortPersons(ArrayList<Person> list, String mode){
        switch (mode){
            case "1":{
                Collections.sort(list, new ComparatorByRegion());
                break;
            }
            case "2":{
                Collections.sort(list, new ComparatorByBirthYear());
                break;
            }
            case "3":{
                Collections.sort(list, new ComparatorByGender());
                break;
            }
            default:{
                Collections.sort(list);
                break;
            }
        }
    }
    @Override
    public int compareTo(Object o) {
        int result = this.name.compareTo(((Person)o).name);
        if(result != 0){
            return result;
        }else{
            result = this.region.compareTo(((Person)o).region);
            if(result != 0){
                return result;
            }else{
                result = this.birthYear - ((Person)o).birthYear;
                if(result != 0){
                    return result;
                }else{
                    if((!this.isMale && !((Person)o).isMale) || (this.isMale && ((Person)o).isMale)){
                        return 0;
                    } else if (!this.isMale && ((Person)o).isMale) {
                        return 1;
                    }else {
                        return -1;
                    }
                }
            }
        }
    }
}
