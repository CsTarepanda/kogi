public class Kadai02{
	public static void main(String[] args){
    String str = "CS (Computer Science) 2016";
    System.out.printf("BEFORE: %s\n", str);
    System.out.printf("AFTER1: %s\n", str.replaceAll("CS", "*"));
    System.out.printf("AFTER2: %s\n", str.replaceAll("[CS]", "*"));
    System.out.printf("AFTER3: %s\n", str.replaceAll("[^CS]", "*"));
    System.out.printf("AFTER4: %s\n", str.replaceAll("[( )]", "-"));
    System.out.printf("AFTER5: %s\n", str.replaceAll("e.", "#"));
	}
}
