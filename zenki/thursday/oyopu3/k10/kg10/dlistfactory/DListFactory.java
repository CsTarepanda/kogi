package kg10.dlistfactory;

import kg10.factory.Factory;
import kg10.factory.Link;
import kg10.factory.Page;
import kg10.factory.Tray;

public class DListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new DListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new DListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new DListPage(title, author);
  }
}
