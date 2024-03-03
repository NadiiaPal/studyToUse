package PR1;

public class PhoneNumber {
    String number;
    String  operator;
    double fee;
    public PhoneNumber(String number, String operator, double fee) {
        this.number = number;
        this.operator = operator;
        this.fee = fee;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "NumberPhone{" +
                "numberPhone='" + number + '\'' +
                ", operator='" + operator + '\'' +
                ", fee=" + fee +
                '}';
    }
}
