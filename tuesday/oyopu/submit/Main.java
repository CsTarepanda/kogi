import java.util.*;
public class Main{
	public static void main(String[] args){
    List<Object> list = new ArrayList<Object>(){{
      add(10);
      add("aaa");
      add("bbb");
      add(true);
    }};

    list.remove(2);
    for(Iterator itr = list.iterator(); itr.hasNext();){
      System.out.println(itr.next());
      itr.remove();
    }
    System.out.println(list);
	}
}
