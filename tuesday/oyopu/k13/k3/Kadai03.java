public class Kadai03{
	public static void main(String[] args){
    String input = "2016/07/12 10:47:51 c0115999ab Kadai01.java ok.";
    System.out.println(input.replaceAll("\\d", "+"));
    System.out.println(input.replaceAll("\\D", "@"));
    System.out.println(input.replaceAll("[A-z]+", "#"));
    System.out.println(input.replaceAll("[^0-z]", "="));
    System.out.println(input.replaceAll("\\.$", "?"));
	}
}
