import java.util.*;
public class Kadai04{
	public static void main(String[] args){
    Map<String, String> map = new LinkedHashMap<String, String>(){{
      put("C0115995", "C");
      put("C0115991", "B");
      put("C0115993", "S");
      put("C0114991", "B");
      put("C0115881", "C");
    }};

    map.entrySet().forEach(e -> System.out.printf("%s, %s\n", e.getKey(), e.getValue()));
	}
}
