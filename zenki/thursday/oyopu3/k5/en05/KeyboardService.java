package en05;

import java.io.*;

public class KeyboardService extends MyServiceFramework{
  private BufferedReader _br;
  KeyboardService(){
    _br = new BufferedReader(new InputStreamReader(System.in));
  }
  @Override
  protected void init(){
    System.out.println("[挨拶サービス　キーボード版]");
  }
  @Override
  protected void read(){
    System.out.print("キーボードから名前を読み込みます。 > ");
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
    System.out.println("[挨拶サービス　キーボード版]を終了します。");
  }
}
