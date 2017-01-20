package en05;

public class Main{
	public static void main(String[] args){
    MyServiceFramework msf1 = new FileService();
    MyServiceFramework msf2 = new KeyboardService();

    msf1.hello();
    msf2.hello();
	}
}
