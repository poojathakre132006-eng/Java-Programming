class Base {
    public int i;
    public int j;

    public Base() {
        System.out.println("inside base constructor");
        this.i = 11;
        this.j = 21;
    }

    public void Fun() {
        System.out.println("inside base fun");
    }
}

class Derived extends Base {
    public int x;

    public Derived() {
        System.out.println("inside derived constructor");
        this.x = 51;
    }

    public void Gun() {
        System.out.println("Inside gun of derived");
        System.out.println("Value of i:" + super.i);
        System.out.println("Value of j:" + super.j);
        System.out.println("Value of x:" + this.x);
    }
}

class ThisSuper {
    public static void main(String A[]) {

        Derived dobj = new Derived();

        dobj.Gun();

    }
}
/*
 * output
inside base constructor
inside derived constructor
Inside gun of derived
Value of i:11
Value of j:21
Value of x:51
 */
