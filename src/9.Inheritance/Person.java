public class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void sayHi() {
    System.out.println("Hi, My name is " + this.name);
  }
}
