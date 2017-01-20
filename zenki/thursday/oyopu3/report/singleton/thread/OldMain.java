public class OldMain extends Thread {

    public static void main(String[] args) {
        System.out.println("START!");

        Thread t1 = new OldMain("A");
        Thread t2 = new OldMain("B");
        t1.start();
        t2.start();

        System.out.println("END!");
    }

    @Override
    public void run() {
        OldSingleton obj = OldSingleton.getInstance();
        System.out.println(this.getName() + ": obj = " + obj);
    }

    public OldMain(String name) {
        super(name);
    }
}
