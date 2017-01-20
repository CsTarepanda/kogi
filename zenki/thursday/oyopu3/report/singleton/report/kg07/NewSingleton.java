package kg07;

public class NewSingleton {
  private static NewSingleton singleton = null;

  private NewSingleton() {
    System.out.println("インスタンスを生成しました");
    waitfor();
  }

  public static synchronized NewSingleton getInstance() {
    if (singleton == null) {
      singleton = new NewSingleton();
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
