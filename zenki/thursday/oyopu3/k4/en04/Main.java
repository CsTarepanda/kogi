package en04;

public class Main{
	public static void main(String[] args){
    OldServer ms = new NewServer();
    ms.send("Tokyo");
    System.out.println("---------------");
    ms.recv("Uplzp");
	}
}
