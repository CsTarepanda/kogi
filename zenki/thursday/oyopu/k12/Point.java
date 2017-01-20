/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

import java.util.Random;

/**
 *
 * @author c0115114
 */
public class Point {
	private int x;
	private int y;
	public Point(){
		x = getRand(10, 20);
		y = getRand(100, 110);
	}

	final public int getRand(int base, int bound){
		return new Random().nextInt(bound - base) + base; 
	}

	@Override
	public String toString(){
		return "(x, y) = (" + x + ", " + y + ")";
	}
}
