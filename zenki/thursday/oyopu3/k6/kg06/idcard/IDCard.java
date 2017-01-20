package kg06.idcard;

import kg06.framework.*;
public class IDCard extends Product{
  private String owner;
  IDCard(String owner){
    System.out.printf("%sのカードを作ります\n", owner);
    this.owner = owner;
  }

  @Override
  public void use(){
    System.out.printf("%sのカードを使います\n", this.owner);
  }

  public String getOwner(){
    return this.owner;
  }
}
