package en07;

public class QMain{
	public static void main(String[] args){
    System.out.println("START!");
    for(int i = 0; i < 8; i++){
      Quadruplet q = Quadruplet.getInstane(i % 4);
      System.out.println(q);
    }
    System.out.println("END!");
	}
}
