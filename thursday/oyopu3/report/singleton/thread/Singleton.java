enum Singleton{
  INSTANCE;
  private Singleton(){
    System.out.println("インスタンスを生成しました");
    waitfor();
  }

  public static Singleton getInstance(){
    return INSTANCE;
  }

  private void waitfor(){
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
