public class Kadai04{
	public static void main(String[] args){
    String str = "<h1>Hello, world!</h1> <p>This is a paragraph.</p>";
    System.out.printf("BEFORE: %s\n", str);
    System.out.printf("AFTER1: %s\n", str.replaceAll("<.{1,4}>", ""));
    System.out.println("");
    str = "TEL: 042-637-2111, DATE: 20160519, TIME: 144459";
    System.out.printf("BEFORE: %s\n", str);
    System.out.printf("AFTER2: %s\n", str.replaceAll("\\d{4,}", "*"));
	}
}
