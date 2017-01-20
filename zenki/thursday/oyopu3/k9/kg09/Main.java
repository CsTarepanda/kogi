package kg09;
public class Main{
	public static void main(String[] args){
    MarkdownBuilder br = new MarkdownBuilder();
    Director director = new Director(br);
    director.construct();
    System.out.println(br.getResult());

    LatexBuilder br2 = new LatexBuilder();
    director = new Director(br2);
    director.construct();
    System.out.println(br2.getResult());
	}
}
