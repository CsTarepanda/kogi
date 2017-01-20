import java.util.*;
public class Kadai05{
	public static void main(String[] args){
    String sen = "To be, or not to be: that is the question.";
    System.out.printf("元の文章: %s\n", sen);
    sen = sen.replaceAll("[,.:]", "").toLowerCase();
    List<String> list = Arrays.asList(sen.split(" "));
    Set<String> set = new TreeSet<String>(){{
      for(String s: list) add(s);
    }};
    System.out.printf("単語数  : %d\n", set.size());
    System.out.print("単語一覧: ");
    for(String s: set) System.out.printf("%s ", s);
    System.out.println("");
	}
}
