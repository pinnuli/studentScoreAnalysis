/**
 * 
 */
package cn.edu.scau.cmi.linxiaoyi.comprehensive.model;

import java.io.Serializable;


/**
 * @author pinnuli
 *
 */

public class Student implements Serializable, Cloneable{
	private String studentId;
	private String name;
	private int attendenceScore;
	private int testScore;
	private int homeworkScore;
	private int finalTestScore;
	private int finalScore;
	
	public Student(String studentId, String name, int attendenceScore, int testScore, int homeworkScore, int finalTestScore,int finalScore) {
		this.studentId = studentId;
		this.name = name;
		this.attendenceScore = attendenceScore;
		this.testScore = testScore;
		this.homeworkScore = homeworkScore;
		this.finalTestScore = finalTestScore;
		this.finalScore = attendenceScore + testScore + homeworkScore + finalTestScore;
		/*总评为前面四项之和*/
	}
	
	public String getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAttendenceScore() {
		return attendenceScore;
	}
	
	public int getTestScore() {
		return testScore;
	}
	
	public int getHomeworkScore() {
		return homeworkScore;
	}
	
	public int getFinalTestScore() {
		return finalTestScore;
	}
	
	public int getFinalScore() {
		return finalScore;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAttendenceScore(int attendenceScore) {
		this.attendenceScore = attendenceScore;
	}
	
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	
	public void setHomeworkScore(int homeworkScore) {
		this.homeworkScore = homeworkScore;
	}
	
	public void setFinalTestScore(int finalTestScore) {
		this.finalTestScore = finalTestScore;
	}
	
	public void setFinalScore() {
		this.finalScore = attendenceScore + testScore + homeworkScore + finalTestScore;
	}
		
	@Override
	public Object clone() throws CloneNotSupportedException {
		Student student = (Student)this.clone();
		return student;
	}

	@Override
	public String toString() {
		return studentId + name + finalScore;
	}
}
