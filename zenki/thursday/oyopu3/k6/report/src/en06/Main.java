package en06;

// imports//{{{
import en06.framework.Factory;
import en06.framework.Player;
import en06.front.RetroFactory;//}}}
public class Main{
  public static void main(String[] args){
    Factory factory = new RetroFactory();
    Player p1 = factory.create("いのうえあきふみ");
    Player p2 = factory.create("akifumi inoue");
    p1.show();
    p2.show();
  }
}
