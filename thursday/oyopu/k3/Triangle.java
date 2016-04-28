public class Triangle{
  double a,b,c;
  Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  boolean isTriangle(){
    return (a < b + c ) && (b < c + a) && (c < a + b);
  }

  double getArea(){
    double s = (a + b + c) / 2.0;
    return Math.sqrt(s*(s - a)*(s - b)*(s - c));
  }
}
