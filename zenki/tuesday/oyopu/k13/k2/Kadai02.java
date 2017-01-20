public class Kadai02{
	public static void main(String[] args){
    String str = "Tokyo University of Technology";
    System.out.println(str.charAt(15));
    System.out.println(str.toLowerCase());
    int st = str.indexOf("Uni");
    System.out.println(str.substring(st, st+3));
    System.out.println(str.indexOf("o", 10));
    System.out.println(str.split(" ")[2]);
	}
}
