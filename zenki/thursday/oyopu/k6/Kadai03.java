public class Kadai03{
	public static void main(String[] args){
    String str = "C0115901, C0115902, B0115901, E0115901, M0115901, M0115902";
    System.out.printf("BEFORE: %s\n", str);
    System.out.printf("AFTER1: %s\n", str.replaceAll("\\d{7}", "*"));
    System.out.printf("AFTER2: %s\n", str.replaceAll("[0-Z]{8}", "*"));
    System.out.printf("AFTER3: %s\n", str.replaceAll("C\\d+", "*"));
    System.out.printf("AFTER4: %s\n", str.replaceAll("^C", "*"));
    System.out.printf("AFTER5: %s\n", str.replaceAll("\\d+$", "*"));
	}
}
