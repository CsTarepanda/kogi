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
public class Person {
	private String name;
	private double height;

	public Person(String name){
		this.name = name;
		this.height = new Random().nextDouble() * (190 - 140) + 140;
	}

	public String toString(){
		return String.format("Person{name=%s, height=%.1f}", name, height);
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}
}
