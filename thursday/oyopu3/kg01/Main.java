package kg01;

public class Main{
	public static void main(String[] args){
    Text[] t = new Text[4];
    t[0] = new Text("Great Editors");
    t[1] = new Item("Atom");
    t[2] = new Item("Emacs");
    t[3] = new Item("Vim");
    for(Text text: t) System.out.println(text);
	}
}
