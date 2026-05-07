abstract class Demo {
  public int i, j;

  public int add(int a, int b) // concrete method
  {
    return a + b;
  }

  public abstract int sun(int a, int b);

}

class hello extends Demo // error
{

}

class abstract_DemoX {
  public static void main(String A[]) {
    hello hobj = new hello();
  }
}