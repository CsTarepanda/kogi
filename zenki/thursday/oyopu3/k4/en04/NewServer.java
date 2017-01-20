package en04;

public class NewServer extends OldServer{
  SecureServer ss;
  public NewServer(){
    ss = new SecureServer();
  }
  @Override
  public void send(String s){
    ss.open();
    ss.encrypt(s);
    ss.close();
  }
  @Override
  public void recv(String s){
    ss.open();
    ss.decrypt(s);
    ss.close();
  }
}
