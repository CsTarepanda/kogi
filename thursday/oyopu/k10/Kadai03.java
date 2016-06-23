import java.util.*;
public class Kadai03{
	public static void main(String[] args){
    Set<String> seta = new HashSet<String>(){{
      add("Tokyo");
      add("Kanagawa");
      add("Saitama");
    }};
    Set<String> setb = new TreeSet<String>(){{
      add("Tokyo");
      add("Gunma");
      add("Kyoto");
      add("Saitama");
    }};
    for(String s: seta) setb.add(s);
    System.out.println("=== 集合Aと集合Bに含まれるすべての要素 ===");
    for(String s: setb) System.out.println(s);
  }
}
