package kg08;
import kg08.framework.Product;
public class Polygon implements Product{
  int[] ax, ay;
  Polygon(int[] ax, int[] ay){
    System.out.println("Polygon が作成されました。");
    this.ax = ax;
    this.ay = ay;
  }

  @Override
  public void use(String s){
    System.out.println(s);
    for(int i = 0; i < ax.length; i++){
      System.out.printf("(%d, %d)", ax[i], ay[i]);
    }
    System.out.println("");
  }

  public Object clone(){
    try{
      Polygon clone = (Polygon)super.clone();
      return clone;
    }catch(CloneNotSupportedException e){
      return null;
    }
  }

  public Product createClone(){
    return (Polygon)clone();
  }
}
