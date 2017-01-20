package kg06.idcard;

import kg06.framework.*;
import java.util.*;
public class IDCardFactory extends Factory{
  List<String> owners = new ArrayList<String>();

  @Override
  public Product createProduct(String owner){
    return new IDCard(owner);
  }

  @Override
  public void registerProduct(Product p){
    String name = ((IDCard)p).getOwner();
    this.owners.add(name);
    System.out.println("現在の所有者一覧");
    for(String s: owners) System.out.printf(" - %s\n", s);
  }
}
