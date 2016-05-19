public class Kadai01{
	public static void main(String[] args){
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    System.out.printf("BEFORE: %s\n", str);
    System.out.printf("AFTER1: %s\n", str.replaceAll("[JSTz]", "+"));
    System.out.printf("AFTER2: %s\n", str.replaceAll("[D-Sd-s]", "+"));
    System.out.printf("AFTER3: %s\n", str.replaceAll("[^H-M]", "+"));
	}
}
