package itrSample;
public class BSReverseIterator implements Iterator{
  BookShelf bookShelf;
  int index;
  BSReverseIterator(BookShelf bs){
    this.bookShelf = bs;
    this.index = bs.getLength() - 1;
  }

  @Override
  public boolean hasNext(){
    return index >= 0;
  }

  @Override
  public Object next(){
    return bookShelf.getBookAt(index--);
  }
}
