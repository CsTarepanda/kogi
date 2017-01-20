import java.util.*;
import java.text.*;
public class Kada05{
	public static void main(String[] args){
    Date d = new Date();
    Format sf = new SimpleDateFormat("今日はyyyy年MM月dd日 hh:mm:ss、1月1日からD日");
    System.out.println(sf.format(d));
	}
}
