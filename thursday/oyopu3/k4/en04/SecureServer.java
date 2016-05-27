package en04;

public class SecureServer{
  public void open(){
    System.out.println("OPEN");
  }

  public void close(){
    System.out.println("CLOSE");
  }

  public void encrypt(String s){
    System.out.println("元の文字列：" + s);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < s.length(); i++){
      int c = (int)s.charAt(i);
      sb.append((char)(c + 1));
    }
    System.out.println("送信文字列：" + sb.toString());
  }

  public void decrypt(String s){
    System.out.println("受信文字列：" + s);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < s.length(); i++){
      int c = (int)s.charAt(i);
      sb.append((char)(c - 1));
    }
    System.out.println("元の文字列：" + sb.toString());
  }
}
