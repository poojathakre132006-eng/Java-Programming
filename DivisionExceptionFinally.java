import java.util.*;

class DivisionExceptionFinally {
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
        } catch (Exception eobj) {
            System.out.println("inside generic catch:" + eobj);
        } finally {
            System.out.println("inside finally bliock");
            sobj = null; // resourece deallocation
            System.gc();
        }

        System.out.println("Division is :" + Ans);

    }
}
