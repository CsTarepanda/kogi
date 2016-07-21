public class Coffee{
  private static int total;
  Coffee(int n){
    total += n;
  }

  public static int getTotalVol(){
    return total;
  }
}
