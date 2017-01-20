/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

/**
 * 四角を作成します。デフォルト値は、高さ3幅4です。
 */
public class Box {
	private int height;
	private int width;
	public Box(){
		this.height = 3;
		this.width = 4;
		System.out.println("Boxクラスのインスタンスを作成しました");
	}

	/**
	 * 四角の面積を計算します。
	 * @return height * width を計算した結果。
	 */
	public int getArea(){
		return height * width;
	}

	/**
	 * 四角の面積を設定します。負の値を設定した場合は、IllegalArgumentExceptionを送出します。
	 * @param height 四角の高さ
	 * @param width 四角の幅
	 * @throws IllegalArgumentException 
	 */
	public void setSize(int height, int width) throws IllegalArgumentException{
		System.out.println("height=" + height + ", width=" + width + "に値を変更します");
		if(height < 0 || width < 0) throw new IllegalArgumentException();
		this.height = height;
		this.width = width;
	}
}
