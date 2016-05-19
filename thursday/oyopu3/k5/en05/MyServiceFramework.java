package en05;

public abstract class MyServiceFramework{
  protected String name;
  protected abstract void init();
  protected abstract void read();
  protected abstract void write();
  protected abstract void finish();
  protected final void hello(){
    init();
    read();
    write();
    finish();
    System.out.println("");
  }
}
