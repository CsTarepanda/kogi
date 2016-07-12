public class Kada01{
	public static void main(String[] args){
    Triangle t1 = new Triangle(2, 5);
    Triangle t2 = new Triangle(3, 7);
    System.out.printf(t1.toString(), "t1");
    System.out.printf(t2.toString(), "t2");
    System.out.println("t1 の底辺と高さを 2倍 にします");
    t1.enlarge(2);
    System.out.println("t2 の底辺と高さを 3倍 にします");
    t2.enlarge(3);
    System.out.printf(t1.toString(), "t1");
    System.out.printf(t2.toString(), "t2");
	}
}
