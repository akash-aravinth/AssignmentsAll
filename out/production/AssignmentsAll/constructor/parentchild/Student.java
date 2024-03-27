package constructor.parentchild;

public class Student extends Parent{
    private static int rollNo;
    Student(String name, int age,int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }
    public static void main(String[] args) {
        Student student = new Student("akash",22,10024);
        System.out.println(student.rollNo +"  "+student.getAge()+"  "+student.getName());
    }

}
