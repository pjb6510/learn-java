import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfTest {
  public static void main(String[] args) {
    try {
      InputStreamReader ir = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(ir);

      System.out.println("숫자를 입력해주세요.");
      int inputted = Integer.parseInt(br.readLine());

      if (inputted % 3 == 0) {
        System.out.println("3의 배수입니다.");
      } else {
        System.out.println("3의 배수가 아닙니다.");
      }
    } catch (Exception e) {

    }
  }
}
