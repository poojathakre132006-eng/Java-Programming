class Base {
    public int i, j;

    public void fun() {
        System.out.println("inside base fun");
    }

    public void gun() {
        System.out.println("inside base gun");
    }

    public void sun() {
        System.out.println("inside base sun");
    }

}

class Derived extends Base {
    public int x, y;

    public void gun() {
        System.out.println("inside derived fun");
    }

    public void sun() {
        System.out.println("inside derived sun");
    }

    public void run() {
        System.out.println("inside derived run");
    }

}

class RMD_overridingX {
    public static void main(String A[]) {

        Base bobj = new Derived();// upcasting

        bobj.fun(); // Base fun
        bobj.gun(); // derived gun
        bobj.sun(); // derived sun

    }
}
/*
 * inside base fun
 * inside derived fun
 * inside derived sun
 */