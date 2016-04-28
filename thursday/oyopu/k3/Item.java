public class Item{
  private String name;
  private int price;
  private static int total;

  Item(String name, int price){
    this.name = name;
    this.price = price;
    Item.total += price;
  }

  public String getProperties(){
    return this.name + ", " + price;
  }

  int getPrice(){
    return price;
  }

  static int getTotal(){
    return Item.total;
  }
}
