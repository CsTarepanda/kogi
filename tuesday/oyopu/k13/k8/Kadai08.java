import java.util.*;
public class Kadai08{
	public static void main(String[] args){
    Set<Integer> set = new TreeSet<Integer>(){{
      Random r = new Random();
      for(int i = 0; i < 10; i++){
        add(r.nextInt(9));
      }
    }};

    System.out.printf("発生した乱数は %d種類\n", set.size());
    set.forEach(System.out::println);
	}
}
