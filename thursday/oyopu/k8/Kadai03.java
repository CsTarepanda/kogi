import java.util.*;
import java.text.*;
public class Kadai03{
	public static void main(String[] args) throws Exception{
    System.out.println("今日は");
    Date date = new Date();
    Format df = new SimpleDateFormat(
          "yyyy年M月d日(E)です"
          );
    System.out.println(df.format(date));
    df = new SimpleDateFormat("今日から2ヶ月と23日後はyyyy年M月d日(E)です");
    Calendar cl = Calendar.getInstance();
    cl.setTime(date);
    cl.add(Calendar.MONTH, 2);
    cl.add(Calendar.DATE, 23);
    System.out.println(df.format(cl.getTime()));
	}
}
