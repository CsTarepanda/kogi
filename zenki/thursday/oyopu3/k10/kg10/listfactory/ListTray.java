package kg10.listfactory;

import java.util.Iterator;
import kg10.factory.Item;
import kg10.factory.Tray;

public class ListTray extends Tray {

  public ListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("  <li>" + caption + "</li>\n");
    buffer.append("  <ul>\n");

    Iterator it =  tray.iterator();
    while(it.hasNext()) {
      Item item = (Item)it.next();
      buffer.append(item.makeHTML());
    }

    buffer.append("  </ul>\n");

    return buffer.toString();
  }
}
