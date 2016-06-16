import java.util.*;
public class Kadai01{
	public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>(){{
      add("School");
      add("Computer");
      add("Science");
    }};
    System.out.println("=== リストに文字列を3つ追加します ===");
    System.out.printf("要素数: %d\n", list.size());
    System.out.println(String.join(" ", list));
    System.out.println("=== リストの途中に文字列を一つ追加します ===");
    list.add(1, "of");
    System.out.printf("要素数: %d\n", list.size());
    System.out.println(String.join(" ", list));
	}
}
