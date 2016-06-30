import java.util.*;
public class Kadai05{
	public static void main(String[] args){
    String sen = "An eye for an eye, a tooth for a tooth.";
    System.out.println(sen);
    Map<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();
    Arrays.asList(sen.toLowerCase().replaceAll("[,.]", "").split(" ")).forEach(s -> {
      List<String> target = map.get(s);
      if(target == null) map.put(s, new ArrayList<String>());
      target = map.get(s);
      target.add(s);
    });
    map.entrySet().forEach(e -> System.out.printf("%-10s: %d\n", e.getKey(), e.getValue().size()));
	}
}
