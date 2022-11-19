public class Tenants {
    private String fname, lname;
    private int creditScore, income;

    public Tenants() {
        this.fname = fname;
        this.lname = lname;
        this.creditScore = creditScore;
        this.income = income;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
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
                "First Name='" + fname + '\'' +
                ", Last Name='" + lname + '\'' +
                ", Credit Score=" + creditScore +
                ", Income=" + income +
                '}';
    }
}
