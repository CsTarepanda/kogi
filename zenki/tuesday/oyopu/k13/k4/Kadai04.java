public class Kadai04{
  public static void main(String[] args){
    int[] a = {50, 40, 30, 20, 10, 0};

    for (int i = 0; i < 10; i++) {
      try{
        int val = 100 / a[i];
        System.out.println("val = " + val);
      }catch(ArithmeticException e){
        System.out.println("0で割りました");
      }catch(Exception e){
        System.out.println("配列の境界を超えました");
      }
    }
  }
}
