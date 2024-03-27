package constructor.classdiagramlibrary.models;

public class Staff extends User{
    private String rollName;
    private String department;

    public String getRollName() {
        return rollName;
    }

    public void setRollName(String rollName) {
        this.rollName = rollName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
