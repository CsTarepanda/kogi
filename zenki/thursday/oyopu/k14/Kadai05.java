import java.util.*;
import java.util.stream.*;
public class Kadai05{
	public static void main(String[] args){
    Map<String, Integer> map = new TreeMap<String, Integer>(){{
      put("MILK", 1);
      put("TOMATO", 3);
      put("YOGURT", 4);
    }};
    System.out.println("---- STEP1 ----");
    map.entrySet().stream().map(e -> String.format("%-8s%d", e.getKey(), e.getValue())).forEach(System.out::println);
    System.out.println("---- STEP2 ----");
    map.keySet().forEach(e -> map.put(e, map.get(e) - 1));
    map.entrySet().stream().map(e -> String.format("%-8s%d", e.getKey(), e.getValue())).forEach(System.out::println);
	}
}
