import java.util.*;
public class Kadai05{
  static String sen = "An eye for an eye, a tooth for a tooth.";
  static Object o = new TreeMap<String, Integer>(){{
    System.out.println(sen);
    for(String s: sen.toLowerCase().replaceAll("[,.]", "").split(" "))
      if(putIfAbsent(s, 1) != null) put(s, get(s) + 1);
    entrySet().forEach(e -> System.out.printf("%-10s: %d\n", e.getKey(), e.getValue()));
  }};

  public static void main(String[] args){}
}
