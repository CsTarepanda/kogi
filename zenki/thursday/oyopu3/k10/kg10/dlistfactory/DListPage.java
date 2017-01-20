package kg10.dlistfactory;

import java.util.Iterator;
import kg10.factory.Item;
import kg10.factory.Page;


public class DListPage extends Page {

  public DListPage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("<html><head><title>" + title + "</title></head>\n");
    buffer.append("<body>\n");

    buffer.append("<h1>" + title + "</h1>\n");
    buffer.append("<dl>\n");
    Iterator it = content.iterator();

    while(it.hasNext()) {
      Item item = (Item)it.next();
      buffer.append(item.makeHTML());
    }

    buffer.append("</dl>\n");
    buffer.append("<hr><address>" + author + "</address>");
    buffer.append("</body></html>\n");

    return buffer.toString();
  }
}
