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
public class Kadai01 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Student s1 = new Student("C0115901", 58);
		Student s2 = new Student("C0115902", 76);
		System.out.println("=== RAW SCORE ===");
		System.out.printf("%s, %d, %s\n", s1.getStudentId(), s1.getScore(), s1.isPass());
		System.out.printf("%s, %d, %s\n", s2.getStudentId(), s2.getScore(), s2.isPass());
		s1.adjust(5);
		s2.adjust(-10);
		System.out.println("=== TUNED SCORE ===");
		System.out.printf("%s, %d, %s\n", s1.getStudentId(), s1.getScore(), s1.isPass());
		System.out.printf("%s, %d, %s\n", s2.getStudentId(), s2.getScore(), s2.isPass());
	}
	
}
