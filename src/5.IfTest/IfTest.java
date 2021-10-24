import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfTest {
  public static void main(String[] args) {
    try {
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);

      System.out.println("숫자를 입력해주세요.");
      String inputtedString = br.readLine();
      int number = Integer.parseInt(inputtedString);

      if (number % 2 == 0) {
        System.out.println("짝수 입니다.");
      } else {
        System.out.println("홀수 입니다.");
      }
    } catch (Exception e) {}
  }
}