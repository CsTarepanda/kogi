package kg04;

public class Heading {
    private String str;

    public Heading(String str) {
        this.str = str;
    }
    
    public void showHeading1() {
        System.out.println("<h1>" + str + "</h1>");
    }
    
    public void showHeading2() {
        System.out.println("<h2>" + str + "</h2>");
    }
}
