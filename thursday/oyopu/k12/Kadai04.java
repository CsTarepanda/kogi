/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

/**
 *
 * @author c0115114
 */
public class Kadai04 {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("C0115901");
		persons[1] = new Person("C0115902");
		persons[2] = new Person("C0115903");
		System.out.println("インスタンスからフィールドの値を取得して表示します");
		for(Person person: persons){
			System.out.print(person.getName());
			System.out.println(", " + person.getHeight());
		}
		System.out.println("");
		System.out.println("インスタンスを直接出力します");
		for(Person person: persons){
			System.out.println(person);
		}
	}
}
