import java.util.*;
import java.util.stream.*;
public class Kadai04{
	public static void main(String[] args){
    List<Integer> list = new ArrayList<>(IntStream.range(0, 20).mapToObj(x -> new Random().nextInt(20)).collect(Collectors.toList()));
    System.out.printf("乱数を20回出力します\n%s\n", String.join(",", list.stream().map(x -> x.toString()).collect(Collectors.toList())));
    Set<Integer> set = new TreeSet<>(list);
    System.out.printf("\n乱数は%d種ありました\n%s\n", set.size(), String.join(",", set.stream().map(x -> x.toString()).collect(Collectors.toList())));
	}
}
