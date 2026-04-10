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
        System.out.println("inside derived constructor");
        this.i = 21;
    }

    public void Gun() {
        System.out.println("Inside gun of derived");
        System.out.println("Value of i:" + i);
        System.out.println("value of i from base:" + super.i);
    }
}

class SuperDemo {
    public static void main(String A[]) {

        Derived dobj = new Derived(); // error

        dobj.Gun();
       

    }
}
