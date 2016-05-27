package kg04;

public class OldHeading implements Print {
    private String str;

    public OldHeading(String str) {
        this.str = str;
    }

    @Override
    public void printH1() {
        System.out.print("<h1>");
        System.out.print(str);
        System.out.print("</h1>");
        System.out.println("");
    }

    @Override
    public void printH2() {
        System.out.print("<h2>");
        System.out.print(str);
        System.out.print("</h2>");
        System.out.println("");        
    }
}
