package kg04;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintHeading2("Tokyo");
        
        // Print インタフェースとしてメソッドを呼び出す
        p.printH1();
        p.printH2();
    }
}
