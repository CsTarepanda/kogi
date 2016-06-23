import java.util.*;
public class Kadai02{
	public static void main(String[] args){
    Set<String> set = new HashSet<String>(){{
      add("Tokyo");
      add("Kanagawa");
      add("Saitama");
      add("Kanagawa");
      add("Tokyo");
    }};
    for(Iterator<String> it = set.iterator(); it.hasNext();){
      String s = it.next();
      System.out.println(s);
    }
  }
}
