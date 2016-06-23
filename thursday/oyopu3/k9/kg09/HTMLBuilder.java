package kg09;
public class HTMLBuilder extends Builder{
  private StringBuilder buffer = new StringBuilder();

  @Override
  public void makeTitle(String title){
    buffer.append("===============\n");
    buffer.append("<h1>" +title+ "</h1><br>\n");
    buffer.append("<br>\n");
  }

  @Override
  public void makeString(String str){
    buffer.append("<ul>" + str + "<br>\n");
    buffer.append("<br>\n");
  }

  @Override
  public void makeItems(String[] items){
    for(String s: items){
      buffer.append("<li>" +s+ "</li><br>\n");
    }
    buffer.append("</ul><br>\n");
  }

  @Override
  public void close(){
    buffer.append("===============<br>\n");
  }

  public String getResult(){
    return buffer.toString();
  }
}
