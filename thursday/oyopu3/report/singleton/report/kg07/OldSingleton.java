package kg07;

public class OldSingleton {
  private static OldSingleton singleton = null;

  private OldSingleton() {
    System.out.println("インスタンスを生成しました");
    waitfor();
  }

  public static OldSingleton getInstance() {
    if (singleton == null) {
      singleton = new OldSingleton();
    }
    return singleton;
  }

  private void waitfor() {
    try {
      Thread.sleep(1000);
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
