package en06.front;

// imports//{{{
import en06.framework.Factory;
import en06.framework.Player;//}}}
public class OldFactory extends Factory{
  @Override
  protected Player createPlayer(String name){
    return new RPGPlayer(name);
  }

  @Override
  protected void postprocess(Player player){
    player.setName(player.getName().toUpperCase().substring(0, 4));
  }
}
