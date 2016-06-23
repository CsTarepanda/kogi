public class Main{
  enum Singleton{
    INSTANCE("INSTANCE"), TEST("TEST");
    Singleton(){
      System.out.println("default constructor");
    }
    Singleton(String s){
      System.out.println(s);
    }
    private String field;
    public String getField(){
      return field;
    }
    public void setField(String field){
      this.field = field;
    }
  }
	public static void main(String[] args) throws Exception{
    System.out.println(Singleton.class.newInstance());
	}
}
