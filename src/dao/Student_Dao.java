package dao;
import java.util.ArrayList;
import java.util.List;
import com.entity.Student;
public class Student_Dao {

		public List<Student> getAllStudent() {

			List<Student> db = new ArrayList<Student>();

			db.add(new Student(101, 89, "Shubham"));
			db.add(new Student(102, 90, "Mahesh"));
			db.add(new Student(103, 91, "Ganesh"));
			db.add(new Student(104, 96, "Rohit"));
			db.add(new Student(105, 78, "Aniket"));

			return db;
		}

	}

