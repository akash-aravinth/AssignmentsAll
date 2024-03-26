package constructor.parentchild;

public class Parent {
    Parent(){
        System.out.println("Parent");
    }
    Parent(int age){
        System.out.println("Parent age is : "+age);
    }
    Parent(String name ){
        System.out.println("Parent Name is : "+name);
    }
    Parent(int age,String name){
        System.out.println("Parent name is : "+name+" and age is : "+age+"\n\n");
    }
}
