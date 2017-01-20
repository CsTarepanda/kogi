package kg10.listfactory;

import kg10.factory.Link;

public class ListLink extends Link {

  public ListLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    String str = "    <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    return str;
  }
}
