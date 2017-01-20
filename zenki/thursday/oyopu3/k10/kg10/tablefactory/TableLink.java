package kg10.tablefactory;

import kg10.factory.Link;

public class TableLink extends Link {

  public TableLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    String str = "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    return str;
  }
}
