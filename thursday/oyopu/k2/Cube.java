public class Cube{
  private int side;
  Cube(int side){
    this.side = side;
  }
  int getSide(){
    return side;
  }
  int getSurfaceArea(){
    return (int)Math.pow(getSide(), 2) * 6;
  }
  int getVolume(){
    return (int)Math.pow(getSide(), 3);
  }
}
