import java.util.*;

class DivisionException {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter First Number :");
        No1 = sobj.nextInt();

        System.out.println("Enter Secound Number :");
        No2 = sobj.nextInt();

        try {
            Ans = No1 / No2;
            System.out.println("Inside try block");
        } catch (ArithmeticException aobj) {
            System.out.println("Inside catch block");
            System.out.println("Exception occured:" + aobj);
        }

        System.out.println("Division is :" + Ans);

    }
}
/*
 * output
 * Enter First Number :
 * 10
 * Enter Secound Number :
 * 0
 * Inside catch block
 * Exception occured:java.lang.ArithmeticException: / by zero
 * Division is :0
 */