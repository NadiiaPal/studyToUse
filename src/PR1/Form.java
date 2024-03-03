package PR1;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Form {
    int id;
    String name;
    LocalDateTime date ;
    ArrayList<Language> languages = new ArrayList<>();
    ArrayList<Hobby> hobbies = new ArrayList<>();;
    Contacts contacts = new Contacts();
    int amountExpensesPerMonth;
    ArrayList<Expense> expenses = new ArrayList<>();
    public Form(int id, String name, int amountExpensesPerMonth) {
        this.id = id;
        this.name = name;
        date = LocalDateTime.now();
        this.amountExpensesPerMonth = amountExpensesPerMonth;
    }

    public int getId() {
        return id;
    }

    public void addLanguages(Language language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language){
        Language languageToRemove = null;
        for (Language lang : this.languages) {
            if (lang.getName().equals(language)) {
                languageToRemove = lang;
                break;
            }
        }
        if (languageToRemove != null) {
            this.languages.remove(languageToRemove);
        }
    }

    public void addHobbies(Hobby hobby) {
        this.hobbies.add(hobby);
    }

    public void removeHobby(String hobby){
        Hobby hobbyToRemove = null;
        for (Hobby hob : this.hobbies) {
            if (hob.getNameHobby().equals(hobby)) {
                hobbyToRemove = hob;
                break;
            }
        }
        if (hobbyToRemove != null) {
            this.hobbies.remove(hobbyToRemove);
        }
    }

    public void addPhoneNumber(PhoneNumber number) {
        this.contacts.numbers.add(number);
    }

    public void removePhoneNumber(String number) {
        PhoneNumber numberToRemove = null;
        for (PhoneNumber num : this.contacts.numbers) {
            if (num.getNumber().equals(number)) {
                numberToRemove = num;
                break;
            }
        }
        if (numberToRemove != null) {
            this.contacts.numbers.remove(numberToRemove);
        }
    }

    public void addEmail(String email) {
        this.contacts.emails.add(email);
    }

    public void removeEmail(String email) {
        String emailToRemove = null;
        for (String em : this.contacts.emails) {
            if (em.equals(email)) {
                emailToRemove = em;
                break;
            }
        }
        if (emailToRemove != null) {
            this.contacts.emails.remove(emailToRemove);
        }
    }

    public void addExpenses(Expense expense) {
        this.expenses.add(expense);
    }

    public void removeExpense(String expenseType) {
        Expense expenseToRemove = null;
        for (Expense expense : expenses) {
            if (expense.getType().equals(expenseType)) {
                expenseToRemove = expense;
                break;
            }
        }
        if (expenseToRemove != null) {
            expenses.remove(expenseToRemove);
        }
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", languages=" + languages +
                ", hobbies=" + hobbies +
                ", contacts=" + contacts +
                ", amountExpensesPerMonth=" + amountExpensesPerMonth +
                ", expenses=" + expenses +
                '}';
    }
}

