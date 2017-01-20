package kg10.dlistfactory;

import kg10.factory.Link;

public class DListLink extends Link {

  public DListLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    String str = "    <dd><a href=\"" + url + "\">" + caption + "</a></dd>\n";
    return str;
  }
}
