import java.io.*;

class BufferedIoX {
    public static void main(String A[]) throws IOException {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = bobj.readLine(); // checked exception

        System.out.println("Hello" + name);

    }
}
/*
 * output
 * C:\Users\pooja\OneDrive\Desktop\PPA\Java Programming>java BufferedIoX
 * Enter your name:
 * pooja
 * Hellopooja
 */