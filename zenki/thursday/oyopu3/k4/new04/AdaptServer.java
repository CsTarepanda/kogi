package new04;

public class AdaptServer implements Server{
  SecureServer ss = new SecureServer();

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
