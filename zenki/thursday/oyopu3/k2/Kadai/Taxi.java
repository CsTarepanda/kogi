public class Taxi extends Car{
  Taxi(double gas){
    super(gas);
  }
  public int getFare(){
    return 500 + (distance / 300) * 100;
  }
}
