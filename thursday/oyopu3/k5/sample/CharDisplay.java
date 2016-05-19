public class CharDisplay extends AbstractDisplay{
  private char _c;
  CharDisplay(char c){
    this._c = c;
  }
  void open(){
    System.out.print("CharDisplay\n<<");
  }
  void print(){
    System.out.print(_c);
  }
  void close(){
    System.out.println(">>");
  }
}
