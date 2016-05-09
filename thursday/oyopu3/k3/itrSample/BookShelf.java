package itrSample;
import java.util.*;
public class BookShelf implements Aggregate{
  ArrayList<Book> books = new ArrayList<Book>();
  int last = 0;

  Book getBookAt(int num){
    return books.get(num);
  }

  void appendBook(Book book){
    books.add(book);
    last++;
  }

  int getLength(){
    return last;
  }

  public Iterator iterator(){
    return new BSReverseIterator(this);
  }
}
