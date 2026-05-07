import java.util.*;

class Arrayindex {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = { 11, 21, 51, 101, 111 };

        System.out.println("enter the index of array :");
        int Index = sobj.nextInt();

        System.out.println("Elemet at that index is :" + Arr[Index]);

        System.out.println("End of Application");
    }
}
/*
 * output
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>javac Arrayindex.java
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java Arrayindex
 * enter the index of array :
 * 0
 * Elemet at that index is :11
 * End of Application
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java Arrayindex
 * enter the index of array :
 * 1
 * Elemet at that index is :21
 * End of Application
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java Arrayindex
 * enter the index of array :
 * 2
 * Elemet at that index is :51
 * End of Application
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java Arrayindex
 * enter the index of array :
 * 3
 * Elemet at that index is :101
 * End of Application
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java Arrayindex
 * enter the index of array :
 * 4
 * Elemet at that index is :111
 * End of Application
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java Arrayindex
 * enter the index of array :
 * 5
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
 * at Arrayindex.main(Arrayindex.java:12)
 * 
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>
 */