package kg10.tablefactory;

import kg10.factory.Factory;
import kg10.factory.Link;
import kg10.factory.Page;
import kg10.factory.Tray;

public class TableFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new TableLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new TableTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new TablePage(title, author);
  }
}
