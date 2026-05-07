class Demo {
  public int i, j;

  public int add(int a, int b) // concrete method
  {
    return a + b;
  }

  public abstract int sun(int a, int b);

}

class Hello extends Demo // error
{
  public int sub(int a, int b) {
    return a - b;
  }
}

class abstract_Demo_complete {
  public static void main(String A[]) {
    Hello hobj = new Hello();

    System.out.println(hobj.add(10, 11));
    System.out.println(hobj.sub(10, 11));
  }
}