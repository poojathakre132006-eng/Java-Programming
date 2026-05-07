import java.util.*;

class Division {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        float No1 = 0.0f, No2 = 0.0f, Ans = 0.0f;

        System.out.println("Enter First Number :");
        No1 = sobj.nextFloat();

        System.out.println("Enter Secound Number :");
        No2 = sobj.nextFloat();

        Ans = No1 / No2;

        System.out.println("Division is :" + Ans);

    }
}
/*
 * output
 * Enter First Number :
 * 10
 * Enter Secound Number :
 * 3
 * Division is :3.3333333
 * 
 * Enter First Number :
 * 10
 * Enter Secound Number :
 * 0
 * Division is :Infinity
 */