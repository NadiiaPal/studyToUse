package PR1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DBForForm db = new DBForForm();
        Form f1 = new Form(1, "Olya", 7500);
        f1.addLanguages(new Language("ukrainian", "C2", false));
        f1.addLanguages(new Language("english", "B1", true));
        f1.addHobbies(new Hobby("Watching movies", 2));
        f1.addHobbies(new Hobby("Studying language", 5));
        f1.addPhoneNumber(new PhoneNumber("0952553145", "Vodafone", 180.50));
        f1.addPhoneNumber(new PhoneNumber("0962568122", "Kyivstar", 120));
        f1.addEmail("olya.@gmail.com");
        f1.addExpenses(new Expense("buying books", 2000));
        f1.addExpenses(new Expense("paying bills", 3500));
        f1.addExpenses(new Expense("going out", 1200));
        f1.addExpenses(new Expense("buying products", 800));
        db.forms.add(f1);

        Form f2 = new Form(2, "Misha", 5000);
        f2.addLanguages(new Language("ukrainian", "C1", false));
        f2.addLanguages(new Language("english", "B1", true));
        f2.addLanguages(new Language("german", "B2", true));
        f2.addHobbies(new Hobby("Physical activity", 7));
        f2.addHobbies(new Hobby("Studying language", 5));
        f2.addPhoneNumber(new PhoneNumber("0950000001", "Vodafone", 250.50));
        f2.addPhoneNumber(new PhoneNumber("0961145523", "Kyivstar", 190));
        f2.addEmail("misha.@gmail.com");
        f2.addExpenses(new Expense("paying bills", 2000));
        f2.addExpenses(new Expense("going out", 1500));
        f2.addExpenses(new Expense("buying coffee", 900));
        f2.addExpenses(new Expense("gym", 600));
        db.forms.add(f2);

        Form f3 = new Form(3, "Sofia", 3500);
        f3.addLanguages(new Language("ukrainian", "C2", false));
        f3.addLanguages(new Language("english", "B2", false));
        f3.addLanguages(new Language("polish", "A2", true));
        f3.addLanguages(new Language("french", "A1", true));
        f3.addHobbies(new Hobby("Physical activity", 7));
        f3.addHobbies(new Hobby("Studying language", 5));
        f3.addHobbies(new Hobby("Reading books", 4));
        f3.addPhoneNumber(new PhoneNumber("0509636562", "Vodafone", 180.5));
        f3.addPhoneNumber(new PhoneNumber("0986321452", "Kyivstar", 135));
        f3.addEmail("sofii.@gmail.com");
        f3.addExpenses(new Expense("paying bills", 1000));
        f3.addExpenses(new Expense("going out", 1500));
        f3.addExpenses(new Expense("buying books", 900));
        f3.addExpenses(new Expense("bus tickets", 100));
        db.forms.add(f3);

        Form f4 = new Form(4, "Mark", 6300);
        f4.addLanguages(new Language("ukrainian", "C2", false));
        f4.addLanguages(new Language("polish", "B1", false));
        f4.addLanguages(new Language("chinese", "A1", true));
        f4.addHobbies(new Hobby("Studying language", 7));
        f4.addHobbies(new Hobby("Physical activity", 5));
        f4.addHobbies(new Hobby("Reading books", 4));
        f4.addPhoneNumber(new PhoneNumber("0955857780", "Vodafone", 120.5));
        f4.addPhoneNumber(new PhoneNumber("0946321452", "Kyivstar", 155));
        f4.addEmail("marrk.@gmail.com");
        f4.addEmail("mar.@gmail.com");
        f4.addExpenses(new Expense("paying bills", 1000));
        f4.addExpenses(new Expense("going out", 1800));
        f4.addExpenses(new Expense("buying books", 900));
        f4.addExpenses(new Expense("bus tickets", 200));
        f4.addExpenses(new Expense("repair in the apartment", 2400));
        db.forms.add(f4);

        Set<String> lang = db.studiedLang();
        System.out.println(lang.toString());
        db.checkLang("english", "B1");
        db.getFee("Olya");
        db.searchLessMore();
        db.findExpenses();






    }
}
