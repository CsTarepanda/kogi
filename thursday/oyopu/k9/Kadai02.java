import java.util.*;
public class Kadai02{
	public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>(){{
      add("Java");
      add("Ruby");
      add("Python");
    }};
    System.out.println("=== リストの要素一覧 ===");
    System.out.println(String.join(" ", list));
    System.out.println("");
    System.out.println("=== リストに含まれているか ===");
    System.out.println("要素Goはリストに含まれて" + (list.contains("Go") ? "います" : "いません"));
    System.out.println("");
    System.out.println("=== リストの要素の変更 ===");
    list.set(1, "Go");
    System.out.println(String.join(" ", list));
	}
}
