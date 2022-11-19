public class Maintenance {
    private int unitNumber;
    private String issue;
    private boolean pet;

    public Maintenance() {
        this.unitNumber = unitNumber;
        this.issue = issue;
        this.pet = pet;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Maintenance{" +
                "Unit Number=" + unitNumber +
                ", Your Issue='" + issue + '\'' +
                ", Pet=" + pet +
                '}';
    }
}
