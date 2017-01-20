import java.util.*;
public class Kadai03{
	public static void main(String[] args){
    Map<String, Integer> map = new TreeMap<String, Integer>(){{
      put("Humburger", 100);
      put("Cheeseburger", 130);
      put("Teriyaki", 310);
      put("Fishburger", 310);
      put("French fries", 250);
    }};

    for(String s: map.keySet()) System.out.printf("%s : %d\n", s, map.get(s));
	}
}
