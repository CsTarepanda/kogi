package kg10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kg10.factory.*;

public class Main {

  public static void main(String[] args) throws IOException {

    System.out.println("Factoryのクラス名を入力してください");

    // 1. キーボードから1行読み込む
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String factoryName = br.readLine();

    // 2. 部品・製品を作る Factory を作成
    Factory factory = Factory.getFactory(factoryName);

    // 3.1 部品を作成
    Link cs = factory.createLink("CS学部", "http://www.teu.ac.jp/gakubu/cs/index.html");
    Link bs = factory.createLink("BS学部", "http://www.teu.ac.jp/gakubu/bionics/index.html");
    Link ms = factory.createLink("MS学部", "http://www.teu.ac.jp/gakubu/media/index.html");
    Link ds = factory.createLink("DS学部", "http://www.teu.ac.jp/gakubu/design/index.html");
    Link hs = factory.createLink("HS学部", "http://www.teu.ac.jp/gakubu/medical/index.html");

    // 3.2 部品を作成
    Tray trayHachi = factory.createTray("八王子");
    trayHachi.add(cs);
    trayHachi.add(bs);
    trayHachi.add(ms);

    Tray trayKamata = factory.createTray("蒲田");
    trayKamata.add(ds);
    trayKamata.add(hs);


    // 3.3 部品を作成
    Page page = factory.createPage("Departments", "学長");

    // 4. Page に部品をまとめて、HTMLで出力する
    page.add(trayHachi);
    page.add(trayKamata);
    page.output();
  }
}
