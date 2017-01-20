package kg10.factory;

import java.util.*;
import java.io.*;
public abstract class Page{
  protected String title;
  protected String author;
  protected ArrayList<Item> content = new ArrayList<>();
  public Page(String title, String author){
    this.title = title;
    this.author = author;
  }

  public void add(Item item){
    content.add(item);
  }

  public void output(){
    try{
      String filename = title + ".html";
      Writer writer = new FileWriter(filename);
      writer.write(this.makeHTML());
      writer.close();
      System.out.println(filename + "を作成しました");
    }catch(IOException e){
      System.out.println("例外");
    }
  }

  public abstract String makeHTML();
}
