import java.util.*;

class ArrayindexException {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = { 11, 21, 51, 101, 111 };

        System.out.println("enter the index of array :");
        int Index = sobj.nextInt();

        try {
            System.out.println("Elemet at that index is :" + Arr[Index]);
            System.out.println("inside try block");
        } catch (ArrayIndexOutOfBoundsException aobj) {
            System.out.println("Exception occures" + aobj);
        }

        System.out.println("End of Application");
    }
}
/*
 * output
 * enter the index of array :
 * 3
 * Elemet at that index is :101
 * inside try block
 * End of Application
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java ArrayindexException
 * enter the index of array :
 * 7
 * Exception occuresjava.lang.ArrayIndexOutOfBoundsException: 7
 * End of Application
 */