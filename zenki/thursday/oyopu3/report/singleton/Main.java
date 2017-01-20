public class Main{
	public static void main(String[] args) throws Exception{
    System.out.println("ok");
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton.class.newInstance();
	}
}
