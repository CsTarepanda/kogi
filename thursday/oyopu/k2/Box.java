import java.util.Random;
public class Box{
  private int width;
  private int height;
  Box(){
    Random r = new Random();
    height = r.nextInt(3) + 2;
    width = r.nextInt(4) + 5;
  }
  int getHeight(){
    return height;
  }
  int getWidth(){
    return width;
  }
  int getPerimeter(){
    return getWidth() * 2 + getHeight() * 2;
  }
  int getArea(){
    return getWidth() * getHeight();
  }
}
