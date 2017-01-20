public class Singleton{
  private static final class SingletonHolder{
    private static final Singleton instance = new Singleton();
  }

  private Singleton(){
    System.out.println("create singleton");
  }

  public static Singleton getInstance(){
    return SingletonHolder.instance;
  }
}
