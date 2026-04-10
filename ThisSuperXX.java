class Base {
    public int i;

    public Base() {
        System.out.println("inside base constructor");
        this.i = 11;

    }

    public void Fun() {
        System.out.println("inside base fun");
    }
}

class Derived extends Base {
    public int i;

    public Derived() {
        System.out.println("inside derived constructor");
        this.i = 21;
    }

    public void Gun() {
        System.out.println("Inside gun of derived");
        System.out.println("Value of i:" + i);
        System.out.println("value of i from base:" + super.i);
    }
}

class ThisSuperXX {
    public static void main(String A[]) {

        Derived dobj = new Derived();

        dobj.Gun();

    }
}
/*
 * output
 * inside base constructor
 * inside derived constructor
 * Inside gun of derived
 * Value of i:21
 * value of i from base:11
 */
