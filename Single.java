class Base {
    public int i;
    public int j;

    public Base() {
        System.out.println("inside base constructor");
        this.i = 0;
        this.j = 0;
    }

    protected void finalize() {
        System.out.println("inside finalize method of base");
    }

    public void Fun() {
        System.out.println("inside base fun");
    }
}

class Derived extends Base {
    public int x;

    public Derived() {
        System.out.println("inside derived constructor");
        this.x = 0;
    }

    protected void finalize() {
        System.out.println("inside finalize method of base");
    }

    public void Gun() {
        System.out.println("Inside gun of derived");
    }
}

public class Single {
    public static void main(String A[]) {

        System.out.println("Inside main");

        Derived dobj = new Derived();

        System.out.println(dobj.i);
        System.out.println(dobj.j);
        System.out.println(dobj.x);

        dobj.Fun();
        dobj.Gun();

        System.out.println("End of main");

    }
}
/*
 * output
 * Inside main
 * inside base constructor
 * inside derived constructor
 * 0
 * 0
 * 0
 * inside base fun
 * Inside gun of derived
 * End of main
 */
