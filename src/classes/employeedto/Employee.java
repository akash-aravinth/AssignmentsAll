package classes.employeedto;

public class Employee {
    private String employeName;
    private String employeId;
    private static String  officeName;

    private int employeSalary;

    public String getEmployeName() {
        return employeName;
    }

    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }

    public String getEmployeId() {
        return employeId;
    }

    public void setEmployeId(String employeId) {
        this.employeId = employeId;
    }

    public static String getOfficeName() {
        return officeName;
    }

    public static void setOfficeName(String officeName) {
        Employee.officeName = officeName;
    }

    public int getEmployeSalary() {
        return employeSalary;
    }

    public void setEmployeSalary(int employeSalary) {
        this.employeSalary = employeSalary;
    }
}
