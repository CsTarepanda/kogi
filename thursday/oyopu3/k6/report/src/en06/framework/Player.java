package en06.framework;

public abstract class Player{
  protected String name;
  
  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public abstract void show();
}
