/*
  public: 모든 곳에서 접근 가능
  protected: 같은 패키지에서는 접근 가능, 다른 패키지에서는 상속을 위해서만 접근 가능
  default (미기재): 같은 패키지에서는 접근 가능. 다른 패키지에서는 접근 불가
  private: 접근 불가
 */

public class AboutClass {
  public static void main(String[] args) {
    Person jason = new Person();

    jason.age = 28;
    jason.name = "jason";

    jason.greeting();

    String[] jasonFamily = { "Seokjoon", "Minseon", "Seobeen" };
    jason.family = jasonFamily;

    for (int i = 0; i < jason.family.length; i++) {
      System.out.println(jason.family[i]);
    }
  }
}
