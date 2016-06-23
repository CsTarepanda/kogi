import java.util.*;
public class Kadai01{
	public static void main(String[] args){
    List list = new ArrayList();
    list.add("red");
    list.add("green");
    list.add("blue");
    for(Iterator<String> it = list.iterator(); it.hasNext();){
      String s = it.next();
      System.out.println(s.toUpperCase());
    }
	}
}
