package cn.edu.scau.cmi.linxiaoyi.comprehensive.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;

import cn.edu.scau.cmi.linxiaoyi.comprehensive.model.Course;
import cn.edu.scau.cmi.linxiaoyi.comprehensive.model.Student;
import cn.edu.scau.cmi.linxiaoyi.comprehensive.view.MessageView;

/**
 * 
 * @author pinnuli
 */
public class MyFileWriter implements Serializable{
	public void saveFile(File file, Course course, ArrayList<Student> students) {
		try {
			if (file.getName().toLowerCase().endsWith(".txt")) {
				BufferedWriter bw = null;
				bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));

				bw.write(course.getCourseName() + "," + course.getCourseTeacher() + "," + course.getCourseClass());
				bw.newLine();

				for (Student student : students) {
					bw.write(student.getStudentId() + "," + student.getName() + "," + student.getAttendenceScore() + ","
							+ student.getTestScore() + "," + student.getHomeworkScore() + ","
							+ student.getFinalTestScore() + "," + student.getFinalScore());
					bw.newLine();
				}
				bw.flush();
				bw.close();
				MessageView.createView("保存成功!");
			} else if (file.getName().toLowerCase().endsWith(".dat")) {
				FileOutputStream fos = null;
				fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(course);
				oos.writeObject(students);
				oos.flush();
				oos.close();
				MessageView.createView("保存成功!!");
			} else {
				MessageView.createView("后缀名错误!");
			}
		} catch (FileNotFoundException e) {
			MessageView.createView("未找到文件!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			MessageView.createView("保存失败!");
		}
	}
}
