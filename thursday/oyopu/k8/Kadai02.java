import java.util.*;
import java.text.*;
public class Kadai02{
	public static void main(String[] args) throws Exception{
    Date date = new Date();
    Format df = new SimpleDateFormat(
          "yyyy年MM月dd日(E) a K:m:s:S z"
          );
    System.out.println(df.format(date));

    df = new SimpleDateFormat("1月1日から数えてD日目");
    System.out.println(df.format(date));
	}
}
