package constructor.parentchild;

public class Student extends Parent{
    Student(){
        System.out.println("Student");
    }
    Student(int age){
        System.out.println("Student age is : "+age);
    }
    Student(String name){
        System.out.println("Student Name : "+name);
    }
    Student(String name,int age){
        System.out.println("Student name : "+name+" and age is : "+age);
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parent1 = new Parent("Siva");
        Parent parent2 = new Parent(45);
        Parent parent3 = new Parent(45,"Siva");
        Student student = new Student();
        Student student1 = new Student("akash");
        Student student2 = new Student(21);
        Student student3 = new Student("akash",21);
    }
}
