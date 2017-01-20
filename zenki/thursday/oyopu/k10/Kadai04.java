import java.util.*;
public class Kadai04{
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
    Set<String> setc = new HashSet<String>();
    for(String s: seta) if(setb.contains(s)) setc.add(s);
    for(String s: setb) if(seta.contains(s)) setc.add(s);
    System.out.println("=== 集合Aと集合Bの共通要素 ===");
    for(String s: setc) System.out.println(s);
  }
}
