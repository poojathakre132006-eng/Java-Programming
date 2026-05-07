final class Demo {
    public void fun() {
        System.out.println("inside demo fun");
    }

    public void gun() {
        System.out.println("inside demo gun");
    }
}

class hello extends Demo // error
{
    public void gun() {
        System.out.println("inside hello gun");
    }
}

class final_class {
    public static void main(String A[]) {

        Demo dobj = new Demo();// allowed
        hello hobj = new hello();
    }
}