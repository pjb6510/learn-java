public class StaticMember {
  int number = 10;
  static int staticNumber = 10;

  public static void main(String[] args) {
    // System.out.println(this.number);
    System.out.println(StaticMember.staticNumber);
  }
}