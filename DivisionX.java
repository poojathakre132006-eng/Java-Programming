import java.util.*;

class DivisionX {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter First Number :");
        No1 = sobj.nextInt();

        System.out.println("Enter Secound Number :");
        No2 = sobj.nextInt();

        Ans = No1 / No2;

        System.out.println("Division is :" + Ans);

    }
}
/*
 * output
 * Enter First Number :
 * 10
 * Enter Secound Number :
 * 0
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at DivisionX.main(DivisionX.java:15)
 */