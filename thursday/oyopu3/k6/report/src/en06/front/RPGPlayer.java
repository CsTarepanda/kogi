package en06.front;

// imports//{{{
import en06.framework.Player;//}}}
public class RPGPlayer extends Player{
  protected RPGPlayer(String name){
    setName(name);
  }

  @Override
  public void show(){
    System.out.printf("NAME: %s\n", name);
  }
}
