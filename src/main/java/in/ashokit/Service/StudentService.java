package in.ashokit.Service;

import java.util.List;

import in.ashokit.entity.Courses;
import in.ashokit.entity.Student;

public interface StudentService {

	public List<Courses> getAllCourses();
	
	public List<String> getAllTimings();
	
	public List<Student> getAllStudentEnquiries();
	
	public void saveStudent(Student student);
}
