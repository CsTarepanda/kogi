package kg01;

public class Person{
  private String name;
  private double height;
  private double weight;

  public void setName(String nm){
    name = nm;
  }
  public String getName(){
    return name;
  }

  public void setParams(double height, double weight){
    this.height = height;
    this.weight = weight;
  }

  public double getBMI(){
    return weight / Math.pow(height, 2);
  }
}
