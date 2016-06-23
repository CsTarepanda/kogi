package kg09;

import java.io.*;

public class LatexBuilder extends Builder{
  private StringBuilder buffer = new StringBuilder();
  private PrintWriter pw = null;

  @Override
  public void makeTitle(String title){
    try{
      pw = new PrintWriter(new File("tx/" + title.replaceAll("\\W", "") + ".tex"));
    }catch(IOException e){
    }
    buffer.append(String.format("\\documentclass[uplatex]{jsarticle}\n\n\\usepackage{mylatex}\n\\usepackage{ap3}\n\\usepackage{ascmac}\n\n\\title{%s}\n\\author{c0115114}\n\\date{06/16}\n\n\\usepackage[dvipdfmx]{graphicx}\n\\begin{document}\n\\maketitle\n", title));
    buffer.append("\n");
  }

  @Override
  public void makeString(String str){
    buffer.append("\\section{" + str + "}\n");
    buffer.append("\n");
  }

  @Override
  public void makeItems(String[] items){
    buffer.append("\\begin{itemize}\n");
    for(String s: items) buffer.append(" \\item " +s+ "\n");
    buffer.append("\\end{itemize}\n");
  }

  @Override
  public void close(){
    buffer.append("\\end{document}");
    pw.print(buffer.toString());
    pw.close();
  }

  public String getResult(){
    return buffer.toString();
  }
}
