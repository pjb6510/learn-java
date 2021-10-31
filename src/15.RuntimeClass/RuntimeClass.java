public class RuntimeClass {
  public static void main(String[] args) {
    Runtime run = Runtime.getRuntime();

    long total = run.totalMemory();
    long free = run.freeMemory();
    long used = total - free;
    System.out.println("총 메모리 : " + total);
    System.out.println("여유 메모리 : " + free);
    System.out.println("사용 메모리 : " + used);

    try {
      run.exec("node -v");
    } catch (Exception e) {}
  }
}
