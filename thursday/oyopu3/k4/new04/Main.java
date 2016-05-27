package new04;

public class Main{
	public static void main(String[] args){
    Server ms = new AdaptServer();
    ms.send("Tokyo");
    System.out.println("---------------");
    ms.recv("Uplzp");
	}
}
