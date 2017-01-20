package kg06;

import kg06.idcard.*;
import kg06.framework.*;

public class Main{
	public static void main(String[] args){
    Factory factory = new IDCardFactory();
    Product testcard = factory.create("test");
    Product kancard = factory.create("kan");
    Product aiueocard = factory.create("aiueo");
    testcard.use();

	}
}
