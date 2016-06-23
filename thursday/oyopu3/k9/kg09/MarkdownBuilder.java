package kg09;

import java.io.*;

public class MarkdownBuilder extends Builder{
  private StringBuilder buffer = new StringBuilder();
  private PrintWriter pw = null;

  @Override
  public void makeTitle(String title){
    try{
      pw = new PrintWriter(new File(title + ".md"));
    }catch(IOException e){
    }
    buffer.append("===============\n");
    buffer.append("# " +title+ "\n");
    buffer.append("\n");
  }

  @Override
  public void makeString(String str){
    buffer.append("* " + str + "\n");
    buffer.append("\n");
  }

  @Override
  public void makeItems(String[] items){
    for(String s: items) buffer.append("  - " +s+ "\n");
    buffer.append("\n");
  }

  @Override
  public void close(){
    buffer.append("===============\n");
    pw.print(buffer.toString());
    pw.close();
  }

  public String getResult(){
    return buffer.toString();
  }
}
