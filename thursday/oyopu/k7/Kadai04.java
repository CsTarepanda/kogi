public class Kadai04{
	public static void main(String[] args){
    int[] a = {30, 40, 50};
    int[] b = {2, 0, -2};
    for(int i = 0; i < 4; i++){
      for(int j = 0; j < 4; j++){
        System.out.print("a[" + i + "] / b[" + j + "] = ");
        try{
          System.out.println(a[i] / b[j]);
        }catch(ArithmeticException e){
          System.out.println("0で割りました");
        }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("配列の境界を越えました");
        }
      }
    }
	}
}
