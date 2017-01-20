public class Sample01{
	public static void main(String[] args){
    String[] strs = {"Tokyo", "University", "of", "Technology"};

    // for(String s: strs) System.out.println(s);
    for(int i = 0; i < strs.length; i++){
      System.out.printf("%s\n", strs[i]);
    }
	}
}
