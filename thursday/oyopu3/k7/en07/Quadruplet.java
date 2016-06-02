package en07;

public class Quadruplet{
  private static Quadruplet[] instances = new Quadruplet[4];
  private int id;
  static {
    for(int i = 0; i < instances.length; i++){
      instances[i] = new Quadruplet(i);
    }
  }
  private Quadruplet(int id){
    System.out.printf("%d番目のインスタンスを生成しました\n", id);
    this.id = id;
  }

  public static Quadruplet getInstane(int id){
    return instances[id];
  }

  public String toString(){
    return String.format("id = %d", id);
  }
}
