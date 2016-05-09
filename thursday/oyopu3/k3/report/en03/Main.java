public class Main{
  public static void main(String[] args){
    for(Object o: new StudentDirectory("./data.txt")){
      System.out.println(o);
    }
  }
}
