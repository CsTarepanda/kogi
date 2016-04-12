class Kadai02{
	public static void main(String[] args){
    int r = new java.util.Random().nextInt(101);
    System.out.println("得点: " + r);
    if(r >= 90) System.out.println("S");
    else if(r >= 80) System.out.println("A");
    else if(r >= 70) System.out.println("B");
    else if(r >= 60) System.out.println("C");
    else System.out.println("D");
	}
}
