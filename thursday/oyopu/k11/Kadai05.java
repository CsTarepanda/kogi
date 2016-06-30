import java.util.*;
public class Kadai05{
	public static void main(String[] args){
    String sen = "An eye for an eye, a tooth for a tooth.";
    System.out.println(sen);
    Map<String, Integer> map = new TreeMap<String, Integer>();
    Arrays.asList(sen.toLowerCase().replaceAll("[,.]", "").split(" ")).forEach(s -> 
      map.put(s, map.get(s) == null ? 1 : map.get(s) + 1));
    map.entrySet().forEach(e -> System.out.printf("%-10s: %d\n", e.getKey(), e.getValue()));
	}
}
