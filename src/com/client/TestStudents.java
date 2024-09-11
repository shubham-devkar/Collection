package com.client;

import java.util.List;

import com.entity.Student;

import Controller.Controller_Student;

public class TestStudents {
	public static void main(String[] args) throws Exception {

		Controller_Student sc = new Controller_Student();

		System.out.println("-------------------------------------------\nAll Students:- ");

		List<Student> db = sc.getStudentController();

		for (Student student : db) {
			System.out.println(student);
		}


		System.out.println("-------------------------------------------\n");
		List<Student> db1 = sc.getStudentNameStartWithChar("S");


		for (Student student : db1) {
			System.out.println(student);
		}

		System.out.println("-------------------------------------------\n");

		List<Student> db2 = sc.getStudentMarksAbove(90);
		for (Student student : db2) {
			System.out.println(student);
		}

		System.out.println("-------------------------------------------");

		List<Student> db3 =sc.getStudentByRollNum(101);
		for (Student student : db3) {
			System.out.println(student);
		}
		System.out.println("-------------------------------------------");

		List<Student> db4 =sc.getStudentByReverse();
		for (Student student : db4) {
            System.out.println(student);
        }
		System.out.println("-------------------------------------------");
	}


}
