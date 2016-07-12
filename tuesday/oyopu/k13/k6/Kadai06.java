import java.util.*;
import java.text.*;
public class Kadai06{
	public static void main(String[] args){
    Date date = new Date();
    DateFormat dft = DateFormat.getDateTimeInstance();
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.MONTH, 10);
    cal.add(Calendar.DATE, 10);
    System.out.println(dft.format(cal.getTime()));
	}
}
