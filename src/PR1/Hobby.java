package PR1;

public class Hobby {
    String nameHobby;
    int durationInYear;
    int rate;

    public Hobby(String nameHobby, int durationInYear) {
        this.nameHobby = nameHobby;
        this.durationInYear = durationInYear;
        if(this.nameHobby.equals("Watching movies")){
            this.rate = 1;
        } else if (this.nameHobby.equals("Physical activity")) {
            this.rate = 3;
        } else if (this.nameHobby.equals("Studying language")) {
            this.rate = 5;
        }else {
            this.rate = 0;
        }
    }

    public String getNameHobby() {
        return nameHobby;
    }

    public void setNameHobby(String nameHobby) {
        this.nameHobby = nameHobby;
    }

    public int getDurationInYear() {
        return durationInYear;
    }

    public void setDurationInYear(int durationInYear) {
        this.durationInYear = durationInYear;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameHobby='" + nameHobby + '\'' +
                ", durationInYear=" + durationInYear +
                ", rate=" + rate +
                '}';
    }
}
