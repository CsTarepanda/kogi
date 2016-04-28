public class Computer{
  String os;
  int ram, disk;
  Computer(){
    this.disk = 512;
    this.ram = 8;
    this.os = "UNKNOWN";
  }
  Computer(String os){
    this();
    this.os = os;
  }
  Computer(String os, int ram){
    this(os);
    this.ram = ram;
  }

  String getOS(){
    return os;
  }
  int getRam(){
    return ram;
  }
  int getDisk(){
    return disk;
  }
}
