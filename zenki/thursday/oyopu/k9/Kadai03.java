import java.util.*;
public class Kadai03{
	public static void main(String[] args){
    Random rdm = new Random();
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++){
      list.add(rdm.nextInt(6));
    }

    int count = 0;
    for(Iterator itr = list.iterator(); itr.hasNext();){
      Object num = itr.next();
      if(num.toString().equals("0")) count++;
      System.out.printf("%s, ", num);
    }
    System.out.printf("\n0 は %d 個ありました\n", count);
	}
}
