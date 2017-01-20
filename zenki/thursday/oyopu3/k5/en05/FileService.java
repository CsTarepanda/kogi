package en05;

import java.io.*;

public class FileService extends MyServiceFramework{
  private String filename = "input";
  private BufferedReader _br;
  FileService(){
    try{
      _br = new BufferedReader(new FileReader(filename));
    }catch(IOException e){
    }
  }
  @Override
  protected void init(){
    System.out.println("[挨拶サービス　ファイル版]");
  }
  @Override
  protected void read(){
    System.out.println("ファイルから名前を読み込みます。");
    try{
      super.name = _br.readLine();
    }catch(IOException e){
    }
  }
  @Override
  protected void write(){
    System.out.printf("こんにちは、%sさん\n", super.name);
  }
  @Override
  protected void finish(){
    System.out.println("[挨拶サービス　ファイル版]を終了します。");
  }
}
