package com.services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.entity.Student;
import com.services.StudRollcom;
import dao.Student_Dao;

public class StudentService {
	Student_Dao dao = null;

	public List<Student> getStudentService() {

		dao = new Student_Dao();

		List<Student> db = dao.getAllStudent();

		return db;
	}

	public List<Student> getStudentNameStartWithChar(String ch) {

		List<Student> db1 = new ArrayList<Student>();

		dao = new Student_Dao();
		List<Student> db = dao.getAllStudent();

		for (Student student : db) {

			if (student.getName().startsWith(ch)) {
				System.out.println(student);
			}

		}

		return db1;
	}

	public List<Student> getStudentMarksAbove(int i) {

		List<Student> db2 = new ArrayList<Student>();

		dao = new Student_Dao();
		List<Student> db = dao.getAllStudent();

		for (Student student : db) {
			if (student.getMarks() > i) {
				System.out.println(student);
			}
		}

		return db2;
	}

	public List<Student> getStudentByRollNum(int i) {

		List<Student> db3 = new ArrayList<Student>();
		dao = new Student_Dao();
		List<Student> db = dao.getAllStudent();

		for (Student student : db) {
			if (student.getRollno() == i) {
				System.out.println(student);
			}
		}
		return db3;
	}

	public List<Student> getStudentByReverse() {
		dao = new Student_Dao();

		List<Student> db = dao.getAllStudent();

//	Collections.sort(db, new StudRollNum());

		return db;
	}


}



