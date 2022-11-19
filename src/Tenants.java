public class Tenants {
    private String name;
    private int creditScore, income;

    public Tenants() {
        this.name = name;
        this.creditScore = creditScore;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Tenants{" +
                "Name='" + name + '\'' +
                ", Credit Score=" + creditScore +
                ", Income=" + income +
                '}';
    }
}
