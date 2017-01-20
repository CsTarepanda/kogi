package kg10.dlistfactory;

import java.util.Iterator;
import kg10.factory.Item;
import kg10.factory.Tray;

public class DListTray extends Tray {

  public DListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuffer buffer = new StringBuffer();

    buffer.append("  <dt>" + caption + "</dt>\n");

    Iterator it =  tray.iterator();
    while(it.hasNext()) {
      Item item = (Item)it.next();
      buffer.append(item.makeHTML());
    }

    return buffer.toString();
  }
}
