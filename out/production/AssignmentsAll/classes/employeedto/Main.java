package classes.employeedto;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeName("akash");
        employee.setEmployeId("akash2002");
        employee.setEmployeSalary(100000);
        Employee.setOfficeName("Zoho");
        System.out.println("Emplyee Name : "+employee.getEmployeName()+
                "\nEmployeeId : "+employee.getEmployeId()+"\nEmployeeSalary : "+
                employee.getEmployeSalary()+"\nEmployee Office Name : "+Employee.getOfficeName());
    }
}
