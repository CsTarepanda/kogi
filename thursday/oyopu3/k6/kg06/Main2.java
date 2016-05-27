package kg06;

import kg06.framework.Factory;
import kg06.framework.Product;
import kg06.pointcard.PointCardFactory;

public class Main2 {
    public static void main(String[] args) {
        //Factory factory = new IDCardFactory();
        Factory factory = new PointCardFactory();

        Product card1 = factory.create("INOUE");
        Product card2 = factory.create("OKADA");

        card1.use();
        card2.use();
        card1.use();
        card1.use();
    }
}
