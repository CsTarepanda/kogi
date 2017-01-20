import java.text.*;
import java.util.*;
public class Kadai04{
	public static void main(String[] args) throws Exception{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    Date from = sdf.parse("1970/01/01");
    Date to = sdf.parse("2016/06/09");
    System.out.println(to.getTime() - from.getTime());

    Date to2 = sdf.parse("2017/01/30");
    System.out.println(to2.getTime() - from.getTime());

    Format f = new SimpleDateFormat("yyyy/MM/dd");
    System.out.println((to2.getTime() - to.getTime()) / 1000 / 60 / 60 / 24);
	}
}
