package PR1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DBForForm {
    ArrayList<Form> forms =  new ArrayList<>();

    public void addForms(Form f) {
        forms.add(f);
    }
    @Override
    public String toString() {
        return "DBForForm{" +
                "forms=" + forms +
                '}';
    }

    public Set<String> studiedLang(){
        Set<String> languages = new HashSet<>();
        for (Form temp:  this.forms) {
            for (Language tempL: temp.languages) {
                languages.add(tempL.getName());
            }
        }
        return languages;
    }

    public void checkLang(String langToCheck){
        int counter = 0;
        for (Form temp:  this.forms) {
            for (Language tempL: temp.languages) {
                if(langToCheck.equals(tempL.getName())){
                    counter++;
                }
            }
        }
        System.out.println("There are " + counter + " students, who know " + langToCheck + " language");
    }

    public void checkLang(String langToCheck, String rate){
        int counter = 0;
        for (Form temp:  this.forms) {
            for (Language tempL: temp.languages) {
                if(langToCheck.equals(tempL.getName()) && rate.equals(tempL.getRate())){
                    counter++;
                }
            }
        }
        System.out.println("There are " + counter + " students, who know " + langToCheck + " language at the level " + rate);
    }

    public double getFee(String namePerson){
        double fee = 0;
        for (Form temp:  this.forms) {
            if(namePerson.equals(temp.name)){
                for (PhoneNumber tempN: temp.contacts.numbers) {
                    fee += tempN.getFee();
                }
            }
        }
        System.out.println("Student " + namePerson + " must pay " + fee + " for mobile connection");
        return fee;
    }

    public void searchLessMore(){
        int countMin = 0, countMax = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for (Form temp:  this.forms) {
            double fee = 0;
            for (PhoneNumber tempN: temp.contacts.numbers) {
                fee += tempN.getFee();
            }
            if(fee < min){
                min = fee;
            }
            if(fee > max){
                max = fee;
            }
        }
        for (Form temp:  this.forms) {
            double fee = 0;
            for (PhoneNumber tempN: temp.contacts.numbers) {
                fee += tempN.getFee();
            }
            if(fee == min){
                countMin++;
            } else if (fee == max) {
                countMax++;
            }
        }
        System.out.println("Amount of student with minimum fee " + min + " : " + countMin +
                "\nAmount of student with maximum fee " + max + " : " + countMax);
    }

    public void findExpenses(){
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        String nameWithMin = "", nameWithMax = "";
        for (Form temp:  this.forms) {
            if(temp.amountExpensesPerMonth < min){
                min = temp.amountExpensesPerMonth;
                nameWithMin = temp.name;
            }
            if(temp.amountExpensesPerMonth > max){
                max = temp.amountExpensesPerMonth;
                nameWithMax = temp.name;
            }
        }
        System.out.println("Student with maximum expenses: " + nameWithMax + "\nStudent with minimum expenses " + nameWithMin);
    }
}
