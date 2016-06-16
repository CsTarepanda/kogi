package en06.framework;

public abstract class Factory{
  public final Player create(String name){
    Player player = createPlayer(name);
    postprocess(player);
    return player;
  }

  protected abstract Player createPlayer(String name);
  protected abstract void postprocess(Player player);
}
