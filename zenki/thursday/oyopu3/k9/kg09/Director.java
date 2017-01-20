package kg09;
public class Director{
  private Builder builder;

  public Director(Builder builder){
    this.builder = builder;
  }
  
  public void construct(){
    builder.makeTitle("Programming Languages");
    builder.makeString("静的型付け言語");
    String[] langs = {"C", "java"};
    builder.makeItems(langs);

    builder.makeString("動的型付け言語");
    langs = new String[]{"python", "ruby"};
    builder.makeItems(langs);
    builder.close();
  }
}
