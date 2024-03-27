package overloadingoverriding.mathoperation;

public class Main {
    public static void main(String[] args) {
        Operation operation = new Operation();
        int a = 5;
        int b = 10;
        double a1 = 12.07;
        double a2 = 15.07;
        System.out.println("--------------addition---------");
        operation.intIntAdd(a,b);
        operation.intDoubleadd(a,a1);
        operation.addDoubleDouble(a1,a2);
        System.out.println("--------------substract------------");
        operation.IntIntsub(a,b);
        operation.IntDoublesub(a,a1);
        operation.doubleDoublesub(a1,a2);
        System.out.println("--------------multiplication---------------");
        operation.multiplyIntInt(a,b);
        operation.multiplyintdouble(a,a1);
        operation.multiplyDoubleDouble(a1,a2);
        System.out.println("---------------Division------------------");
        operation.divIntInt(a,b);
        operation.divintDouble(a,a1);
        operation.divDouble(a1,a2);
    }
}
