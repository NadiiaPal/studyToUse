package PR1;

public class Language {
    String name;
    String rate;
    boolean isStudyingNow;

    public Language(String name, String rate, boolean isStudyingNow) {
        this.name = name;
        this.rate = rate;
        this.isStudyingNow = isStudyingNow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public boolean isStudyingNow() {
        return isStudyingNow;
    }

    public void setStudyingNow(boolean studyingNow) {
        isStudyingNow = studyingNow;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                ", rate='" + rate + '\'' +
                ", isStudyingNow=" + isStudyingNow +
                '}';
    }
}
