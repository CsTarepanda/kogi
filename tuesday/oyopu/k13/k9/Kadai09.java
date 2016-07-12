import java.util.*;
public class Kadai09{
	public static void main(String[] args){
    Map<String, Integer> map = new TreeMap<String, Integer>(){{
      String[] ss = {"Java", "C++", "Ruby", "Python"};
      Integer[] is = {220, 400, 30, 23};
      for(int i = 0; i < ss.length; i++) put(ss[i], is[i]);
    }};
    map.entrySet().forEach(e -> System.out.printf("KEY: %-7sVALUE: %d\n", e.getKey(), e.getValue()));
	}
}
