class Demo {
    public void fun() {
        System.out.println("inside demo fun");
    }

    public final void gun() {
        System.out.println("inside demo gun");
    }
}

class hello extends Demo {
    public void gun()// error
    {
        System.out.println("inside hello gun");
    }
}

class final_method {
    public static void main(String A[]) {

        hello hobj = new hello();
    }
}