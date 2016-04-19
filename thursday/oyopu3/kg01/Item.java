package kg01;

public class Item extends Text{
  public Item(String body){
    super(body);
  }

  @Override
  public String toString(){
    return "* "+body;
  }
}
