public class Triangle{
  int base, height;
  Triangle(int base, int height){
    this.base = base;
    this.height = height;
  }

  double getArea(){
    return height * base / 2.0;
  }

  void enlarge(int n){
    height *= n;
    base *= n;
  }

  public String toString(){
    return "%s" + String.format(" の面積 : %.1f\n", getArea());
  }
}
