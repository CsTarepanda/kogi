package kg04;

public class PrintHeading extends Heading implements Print{
  public PrintHeading(String str){
    super(str);
  }
  @Override
  public void printH1(){
    super.showHeading1();
  }

  @Override
  public void printH2(){
    super.showHeading2();
  }
}
