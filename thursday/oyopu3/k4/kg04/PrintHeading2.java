package kg04;

public class PrintHeading2 implements Print{
  private Heading _h;
  public PrintHeading2(String str){
    this._h = new Heading(str);
  }

  @Override
  public void printH1(){
    _h.showHeading1();
  }

  @Override
  public void printH2(){
    _h.showHeading2();
  }
}
