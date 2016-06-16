import java.util.*;
import java.text.*;
public class Kadai01{
	public static void main(String[] args){
    Date date = new Date();
    System.out.println("Dateクラスのインスタンスを直接出力");
    System.out.println(date);

    System.out.println("");

    System.out.println("日付のみ");
    Format df = DateFormat.getDateInstance();
    System.out.println(df.format(date));

    System.out.println("");

    System.out.println("日付と時刻");
    df = new SimpleDateFormat("yyyy/MM/dd k:m:ss");
    System.out.println(df.format(date));

    System.out.println("");

    System.out.println("時刻のみ");
    df = new SimpleDateFormat("k:m:ss");
    System.out.println(df.format(date));
	}
}
