public class Box{
  int width, height;
  Box(int w, int h){
    width = w;
    height = h;
  }

  double getDiagonal(){
    return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
  }

  void changeSize(int w, int h){
    width += w;
    height += h;
  }

  public String toString(){
    return String.format("%d x %d", width, height);
  }
}
