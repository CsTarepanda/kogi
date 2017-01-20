import java.util.*;
public class Kadai03{
	public static void main(String[] args){
    List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Ruby"));
    System.out.println("---- STEP1 ----");
    System.out.printf("リストの大きさ : %d\n", list.size());
    System.out.println(String.join("\n", list));

    list.add(1, "Go");
    list.remove("Ruby");
    list.add(0, "Perl");

    System.out.println("---- STEP2 ----");
    System.out.printf("リストの大きさ : %d\n", list.size());
    System.out.println(String.join("\n", list));
	}
}
