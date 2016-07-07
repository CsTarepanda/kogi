/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author c0115114
 */
public class Kadai03 {
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		try{
			b1.setSize(8, 7);
			b1.setSize(-3, 6);
		}catch(IllegalArgumentException e){
			System.out.println("負の値は入力できません");
		}

		System.out.printf("b1の面積: %d\n", b1.getArea());
		System.out.printf("b2の面積: %d\n", b2.getArea());
		
	}
}
