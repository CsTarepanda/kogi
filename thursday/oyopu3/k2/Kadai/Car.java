public class Car{
  private double gas;
  protected int distance;

  Car(double gas){
    this.gas = gas;
  }

  public void run(int d){
    distance += d;
    gas -= d/10000.0;
  }

  public double getGas(){
    return gas;
  }
}
