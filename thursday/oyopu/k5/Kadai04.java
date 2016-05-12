public class Kadai04{
	public static void main(String[] args){
    String str2 = "1404-1, Katakuramachi, Hachioji, Tokyo  192-0982,  JAPAN";
    String result;
    System.out.println(str2);
    System.out.println(str2.replaceAll("achi", "cho"));
    System.out.println(str2.replaceAll("[a-n]", "*"));
    System.out.println(str2.replaceAll("[tkmc]", "").replaceAll("a", "#"));
    System.out.println(str2.replaceAll("[0-9]{4}", "????"));
	}
}
