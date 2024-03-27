package overloadingoverriding.mathoperation;

public class Operation {
    public void intIntAdd(int a,int b){
        System.out.println("Adding Integer,Integer : "+(a+b));
    }
    public void intDoubleadd(int a,double b){
        System.out.println("Adding Integer and Double : "+(a+b));
    }
    public void addDoubleDouble(double a,double b){
        System.out.println("Adding Double and Double : "+(a+b));
    }
    public void IntIntsub(int a,int b){
        System.out.println("Substract integer and integer : "+ (a-b));
    }
    public void IntDoublesub(int a,double b){
        System.out.println("Substract integer,Double : "+(a-b));
    }
    public void doubleDoublesub(double a,double b){
        System.out.println("Substract Double and Double : "+(a-b));
    }
    public void multiplyIntInt(int a,int b){
        System.out.println("Multiply integer integer : "+a*b);
    }
    public void multiplyintdouble(int a,double b){
        System.out.println("Multiply intDouble : "+a*b);
    }
    public void multiplyDoubleDouble(double a,double b){
        System.out.println("Multiply double double : "+a*b);
    }
    public void divIntInt(int a,int b){
        System.out.println("division int int : "+a/b);
    }
    public void divintDouble(int a,double b){
        System.out.println("Division intDouble : "+ a/b);
    }
    public void divDouble(double a,double b){
        System.out.println("Division DoubleDouble : "+ a*b);
    }
}
