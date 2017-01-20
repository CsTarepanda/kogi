package kg06.pointcard;

import kg06.framework.*;
public class PointCardFactory extends Factory{
  @Override
  public Product createProduct(String owner){
    return new PointCard(owner);
  }

  @Override
  public void registerProduct(Product product){
    ((PointCard)product).setPoint(1000);
    System.out.println("チャージしました (1000pt)");
  }
}
