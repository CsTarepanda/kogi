public class Kadai03{
	public static void main(String[] args){
    for(int i = 3; i >= -3; i--){
      System.out.print("8 / " + i + " = ");
      try{
        System.out.println(8 / i);
      }catch(ArithmeticException e){
        System.out.println("0で割りました");
      }
    }
	}
}
