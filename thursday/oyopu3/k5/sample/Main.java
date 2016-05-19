public class Main{
	public static void main(String[] args){
    AbstractDisplay cdis = new CharDisplay('c');
    AbstractDisplay sdis = new StringDisplay("Tokyo University of Technology");
    cdis.display();
    sdis.display();
	}
}
