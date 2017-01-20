package kg09;

public class TextBuilder extends Builder{
  private StringBuilder buffer = new StringBuilder();

  @Override
  public void makeTitle(String title){
    buffer.append("===============\n");
    buffer.append("[" +title+ "]\n");
    buffer.append("\n");
  }

  @Override
  public void makeString(String str){
    buffer.append("★ " + str + "\n");
    buffer.append("\n");
  }

  @Override
  public void makeItems(String[] items){
    for(String s: items){
      buffer.append("  - " +s+ "\n");
    }
    buffer.append("\n");
  }

  @Override
  public void close(){
    buffer.append("===============\n");
  }

  public String getResult(){
    return buffer.toString();
  }
}
