package kg06.pointcard;

import kg06.framework.*;
public class PointCard extends Product{
  private int point;
  private String owner;
  PointCard(String owner){
    System.out.printf("%sのカードを作成しました\n", owner);
    this.owner = owner;
  }

  @Override
  public void use(){
    this.point -= 200;
    System.out.printf("%sのカードを使用しました (%d pt)\n", this.owner, this.point);
  }

  public void setPoint(int point){
    this.point = point;
  }

  public int getPoint(){
    return this.point;
  }
}
