package kg01;

public class Q1{
	public static void main(String[] args){
    Person p1;
    String str;
    double bmi;
    p1 = new Person();
    p1.setName("Raoh");
    str = p1.getName();
    p1.setParams(2.10, 145);
    bmi = p1.getBMI();
    System.out.println("NAME: " +str);
    System.out.println("BMI: " +bmi);
	}
}
