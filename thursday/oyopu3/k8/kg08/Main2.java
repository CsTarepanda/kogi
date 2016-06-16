package kg08;
import kg08.framework.Manager;
import kg08.framework.Product;
public class Main2{
	public static void main(String[] args){
    int[] x = {10, 15, 5, 20};
    int[] y = {5, 5, 10, 10};
    Manager manager = new Manager();
    Product p0 = new Polygon(x, y);
    manager.register("Polygon", p0);
    Product p1 = manager.create("Polygon");
    Product p2 = manager.create("Polygon");
    p1.use("p1");
    p2.use("p2");

    System.out.println("配列を1ヶ所だけ変更します。");
    x[3] = 30;

    p1.use("p1");
    p2.use("p2");
    p0.use("p0");
	}
}
