public class Interface {
  public static void main(String[] args) {
    TestClass tc = new TestClass();
    tc.sayHi();
  }
}

interface InterA {
  int a = 10; // static final

  public void sayHi(); // abstract
}

class TestClass implements InterA {
  public void sayHi() {
    System.out.println("안녕하세요");
  }
}
