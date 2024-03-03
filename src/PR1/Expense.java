package PR1;

public class Expense {
    String type;
    double sum;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Expense(String type, double sum) {
        this.type = type;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Expense{" +
                type + ':' +
                sum +
                '}';
    }
}
