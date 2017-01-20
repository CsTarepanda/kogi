package kg08.framework;
import java.util.*;
public class Manager{
  Map<String, Product> db = new HashMap<String, Product>();
  public void register(String name, Product p){
    db.put(name, p);
  }

  public Product create(String name){
    return db.get(name).createClone();
  }
}
