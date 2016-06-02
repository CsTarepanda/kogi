package kg07;

public class Singleton{
  private static Singleton singleton = new Singleton();
  private Singleton(){
    System.out.println("インスタンスを作成しました。");
  }

  public static Singleton getInstance(){
    System.out.println("getInstance()が呼ばれました");
    return singleton;
  }

  public static void main(String[] args) throws Exception{
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.class.newInstance();
    System.out.println(obj1 == obj2);
  }
}
