class Base {
    public int i;

    public Base(int no) {
        System.out.println("inside base constructor");
        this.i = no;

    }

    public void Fun() {
        System.out.println("inside base fun");
    }
}

class Derived extends Base {
    public int i;

    public Derived() {
        super(11);// explicite call to base constructor
        System.out.println("inside derived constructor");
        this.i = 21;
    }

    public void Gun() {
        System.out.println("Inside gun of derived");
        System.out.println("Value of i:" + i);
        System.out.println("value of i from base:" + super.i);
    }
}

class SuperDemoX {
    public static void main(String A[]) {

        Derived dobj = new Derived();

        dobj.Gun();

    }
}
/*
inside base constructor
inside derived constructor
Inside gun of derived
Value of i:21
value of i from base:11
*/