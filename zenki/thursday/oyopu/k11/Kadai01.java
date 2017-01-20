import java.util.*;
public class Kadai01{
	public static void main(String[] args){
    Map<String, String> map = new HashMap<String, String>(){{
      put("C0115995", "C");
      put("C0115991", "B");
      put("C0115997", "X");
      put("C0115993", "A");
      put("C0114991", "B");
    }};
    String get = "C0114991";
    System.out.printf("%s : %s\n", get, map.get(get));
    get = "C0115995";
    System.out.printf("%s : %s\n", get, map.get(get));
	}
}
