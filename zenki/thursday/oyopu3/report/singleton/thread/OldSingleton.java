public class OldSingleton {
  private static volatile OldSingleton singleton = null;

  private OldSingleton() {
    System.out.println("インスタンスを生成しました");
    waitfor();
  }

  public static synchronized OldSingleton getInstance() {
    System.out.println("getInstance " + singleton);
    if (singleton == null) {
      System.out.println("create instance");
      singleton = new OldSingleton();
    }
    System.out.println("provide instance");
    return singleton;
  }

  private void waitfor() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
