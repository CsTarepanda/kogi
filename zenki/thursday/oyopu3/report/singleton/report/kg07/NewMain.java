package kg07;

public class NewMain extends Thread{
  public static void main(String[] args) {
    System.out.println("START!");

    Thread t1 = new NewMain("A");
    Thread t2 = new NewMain("B");
    t1.start();
    t2.start();

    System.out.println("END!");
  }

  @Override
  public void run() {
    NewSingleton obj = NewSingleton.getInstance();
    System.out.println(this.getName() + ":obj=" + obj);
  }

  public NewMain(String name) {
    super(name);
  }
}
