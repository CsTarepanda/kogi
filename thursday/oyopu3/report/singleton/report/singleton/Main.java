public class Main extends Thread {
  public static void main(String[] args) {
    System.out.println("START!");

    Thread t1 = new Main("A");
    Thread t2 = new Main("B");
    t1.start();
    t2.start();

    System.out.println("END!");
  }

  @Override
  public void run() {
    Singleton obj = Singleton.INSTANCE;
    System.out.println(this.getName() + ":obj=" + obj.hashCode());
  }

  public Main(String name) {
    super(name);
  }
}
