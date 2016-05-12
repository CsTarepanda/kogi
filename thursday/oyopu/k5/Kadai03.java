public class Kadai03{
	public static void main(String[] args){
    String str1 = "School of Computer Science";
    String result;
    System.out.println(str1);
    System.out.println(str1.replaceAll("of", "for"));
    System.out.println(str1.replaceAll(" ", ""));
    System.out.println(str1.replaceAll("[oe]", "*"));
    System.out.println(str1.replaceAll("[^oe]", "?"));
	}
}
