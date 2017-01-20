import java.util.*;
public class Kadai02{
	public static void main(String[] args){
    Map<String, Integer> map = new HashMap<String, Integer>(){{
      put("Humburger", 100);
      put("Cheeseburger", 130);
      put("Teriyaki", 310);
      put("Fishburger", 310);
      put("French fries", 250);
    }};
    String get = "Teriyaki";
    System.out.printf("%s : %d\n", get, map.get(get));
    get = "Cheeseburger";
    System.out.printf("%s : %d\n", get, map.get(get));
	}
}
