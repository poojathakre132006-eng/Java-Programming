import java.io.*;

class BufferedIo {
    public static void main(String A[]) {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = bobj.readLine(); // checked exception

        System.out.println("Hello" + name);

    }
}
/*
output
C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>javac BufferedIo.java
BufferedIo.java:9: error: unreported exception IOException; must be caught or declared to be thrown
       String name=bobj.readLine();  //checked exception
                                ^
1 error
 */