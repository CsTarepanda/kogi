public class Student{
  private int math;
  private int prog;
  void setScore(int math, int prog){
    this.math = math;
    this.prog = prog;
  }
  double getAverage(){
    return (math + prog) / 2.0;
  }
  boolean isPass(){
    return math >= 60 && prog >= 60;
  }
}
