public class ReiterationClass {
  public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    outer.sayHi();
    inner.sayHi();

    SOuter.SInner Sinner = new SOuter.SInner();
    Sinner.sayHi();

    Outer outer2 = new Outer() {
      public void sayHi() {
        System.out.println("I'm overrided method!");
      }
    };

    outer2.sayHi();
  }
}

class Outer {
  String name = "out";
  int age;

  public void sayHi() {
    System.out.println("Hi I'm outer!");
  }

  class Inner {
    public void sayHi() {
      System.out.println("Hi I'm inner!");
      System.out.println(name);
    }
  }
}

class SOuter {
  static int age = 10;

  static class SInner {
    public void sayHi() {
      System.out.println("Hi I'm static inner class");
    }
  }
}
