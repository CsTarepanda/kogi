package itrSample;
public class Main{
	public static void main(String[] args){
    BookShelf b = new BookShelf();
    b.appendBook(new Book("java"));
    b.appendBook(new Book("python"));
    b.appendBook(new Book("ruby"));
    b.appendBook(new Book("c++"));
    Iterator bitr = b.iterator();
    while(bitr.hasNext()){
      System.out.println(((Book)bitr.next()).getName());
    }
	}
}
