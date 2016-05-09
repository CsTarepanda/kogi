import java.util.ArrayList;
import java.util.List;
public class Sample02{
	public static void main(String[] args){
    List<String> data = new ArrayList<String>(){{
      add("Tokyo");
      add("University");
      add("of");
      add("Technology");
    }};

   // for(String s: data) System.out.println(s);
    for(int i = 0; i < data.size(); i++){
      System.out.printf("%s\n", data.get(i));
    }
	}
}
