/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kg12;

import javax.print.Doc;

/**
 *
 *  学生を表すクラスです。 <br>
 *  このクラスは学籍番号 studentID と得点 score をフィールドとして持ちます。
 */
public class Student {
	private String studentId;
	private int score;

	/**
	 * 
	 * @param studentId
	 * @param score 
	 */
	public Student(String studentId, int score) {
		this.studentId = studentId;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public String getStudentId() {
		return studentId;
	}

	/**
	 *
	 * この学生が合格か不合格かを判断します。
	 * @return このインスタンスの score が60 以上の場合 true を返します。　その他の場合は false を返します。
	 */
	public boolean isPass(){
		return score >= 60;
	}

	/**
	 * 
	 * この学生の得点を調整します。　引数の値がこのインスタンスのscoreに加算されます。引数に負の値を入れることも出来ます。
	 * @param diff scoreに加算する数値
	 */
	public void adjust(int diff){
		this.score += diff;
	}
	
}
