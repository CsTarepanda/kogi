public class Kadai02{
	public static void main(String[] args){
    int[] a = {10, 20, 30};
    for(int i = 0; i < 10; i++){
      try{
        System.out.println(a[i]);
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("配列の外側にアクセスしました");
        break;
      }
    }
	}
}
