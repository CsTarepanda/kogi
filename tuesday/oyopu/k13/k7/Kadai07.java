import java.util.*;
public class Kadai07{
	public static void main(String[] args){
    List<String> list = new ArrayList<String>(){{
      add("Hino");
      add("Toyoda");
      add("Hachioji");
    }};

    System.out.println(String.join(", ", list) + "のリストを作成します");
    System.out.println(String.join("\n", list));
    System.out.println("先頭に Tachikawa を挿入します");
    list.add(0, "Tachikawa");
    System.out.println(String.join("\n", list));
    System.out.println("Hino, Toyoda を削除します");
    for(String s: new String[]{"Hino", "Toyoda"}) list.remove(s);
    System.out.println(String.join("\n", list));
	}
}
