public class ThreadTest {
  public static void main(String[] args) {
    ThreadA ta = new ThreadA();

    ThreadB runnableB = new ThreadB();
    Thread tb = new Thread(runnableB);

    ta.start();
    tb.start();

    tb.setPriority(10); // 스레드 우선순위 설정 : 1~10
    ta.setPriority(1);
  }
}

class ThreadA extends Thread {
  @Override
  public void run() {
    while (true) {
      try {
        System.out.print("-");
        Thread.sleep(300);
      } catch (Exception e) {

      }
    }
  }
}

class ThreadB implements Runnable {
  @Override
  public void run() {
    while (true) {
      try {
        System.out.print("_");
        Thread.sleep(300);
      } catch (Exception e) {

      }
    }
  }
}
