public class Wrapper {
  public static void main(String[] args) {
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    // Integer intClass = new Integer(100); // deprecated
    Integer intClass = Integer.valueOf(100);

    System.out.println(intClass.floatValue());
    System.out.println(intClass.toString());

    // Autoboxing

    Integer intClass2 = 200;
    int intvalue2 = intClass2;
    System.out.println(intvalue2);

    int parsingValue = Integer.parseInt("12345");
    System.out.println(parsingValue);
  }
}
