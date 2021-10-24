import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {
  public static void main(String[] args) {
    try {
      /*
      int a = System.in.read();
      System.out.println("your input is " + a);
      */

      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);

      String str = br.readLine();

      System.out.println(str);
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
