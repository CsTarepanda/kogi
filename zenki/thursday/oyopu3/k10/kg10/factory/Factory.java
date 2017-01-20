package kg10.factory;

import java.lang.reflect.*;
public abstract class Factory{
  public static Factory getFactory(String classname){
    Factory factory = null;
    try{
      factory = (Factory)Class.forName(classname).newInstance();
    }catch(ClassNotFoundException e){
      System.out.println(classname + "が見つかりません");
    }catch(Exception e){
      System.out.println("例外");
    }
    return factory;
  }
  public abstract Link createLink(String caption, String url);
  public abstract Tray createTray(String caption);
  public abstract Page createPage(String title, String author);
}
