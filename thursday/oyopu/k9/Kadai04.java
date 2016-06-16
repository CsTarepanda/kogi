import java.util.*;
public class Kadai04{
	public static void main(String[] args){
    List<String> list = new ArrayList<String>(){{
      add("Without");
      add("haste");
      add("but");
      add("without");
      add("rest");
    }};
    System.out.println("=== 元の文字列 ===");
    System.out.println("Without haste, but without rest.");
    System.out.println("");
    System.out.println("=== リストの要素 ===");
    for(String s: list) System.out.println(s);
    System.out.println("");
    System.out.println("=== リストの要素からWithoutを削除する ===");
    for(Iterator itr = list.iterator(); itr.hasNext();){
      if(itr.next().toString().toLowerCase().equals("without")) itr.remove();
    }
    for(String s: list) System.out.println(s);
	}
}
