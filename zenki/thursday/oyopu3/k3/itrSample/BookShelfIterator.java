package itrSample;
public class BookShelfIterator implements Iterator{
  BookShelf bookShelf;
  int index = 0;
  BookShelfIterator(BookShelf bs){
    this.bookShelf = bs;
  }

  public boolean hasNext(){
    return bookShelf.getLength() > index;
  }

  public Object next(){
    return bookShelf.getBookAt(index++);
  }
}
