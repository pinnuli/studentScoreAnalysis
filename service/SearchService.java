package cn.edu.scau.cmi.linxiaoyi.comprehensive.service;

import java.util.ArrayList;

import cn.edu.scau.cmi.linxiaoyi.comprehensive.model.Student;

/**
 * 
 * @author pinnuli
 */
public class SearchService {

	public ArrayList<Student> search(ArrayList<Student> students, String message) {
		ArrayList<Student> studentsTemp = new ArrayList<Student>();
		for (Student student : students) {
			if (student.toString().contains(message))/*查找是否包含关键字*/
				studentsTemp.add(student);
		}
		return studentsTemp;
	}
}
