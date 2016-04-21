public class Kadai01{
	public static void main(String[] args){
    Taxi taxi = new Taxi(60);
    taxi.run(10000);
    System.out.println("Fare :" + taxi.getFare());
    System.out.println("Gas  :" + taxi.getGas());
	}
}
