package kg01;

public class Text{
  protected String body;
  public Text(String body){
    this.body = body;
  }

  @Override
  public String toString(){
    return body;
  }
}
