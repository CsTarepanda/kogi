public class StringDisplay extends AbstractDisplay{
  private String _s;
  private int _len;
  StringDisplay(String s){
    this._s = s;
    this._len = s.length();
  }
  void open(){
    System.out.println("StringDisplay");
    _printLine();
  }
  void print(){
    System.out.printf("|%s|\n", _s);
  }
  void close(){
    _printLine();
  }
  private void _printLine(){
    System.out.print("+");
    for(int i = 0; i < _len; i++){
      System.out.print("-");
    }
    System.out.println("+");
  }
}
