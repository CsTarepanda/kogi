package en04;

public class Main2{
	public static void main(String[] args){
    SecureServer ss = new SecureServer();
    ss.open();
    ss.encrypt("Tokyo");
    ss.close();

    System.out.println("---------------");

    ss.open();
    ss.decrypt("Lbublvsbndbuj-!Ibdijpkj");
    ss.close();
	}
}
