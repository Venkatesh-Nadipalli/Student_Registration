package in.ashokit.Service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.Repository.CourseRepo;
import in.ashokit.Repository.StudentRepo;
import in.ashokit.Repository.TimingsRepo;
import in.ashokit.entity.Courses;
import in.ashokit.entity.Student;

@Service
public class StudentServiceimpl implements StudentService{

	@Autowired
	private StudentRepo studentrepo;

	@Autowired
	private CourseRepo courserepo;
	
	@Autowired
	private TimingsRepo timingsrepo;
	
	public List<Courses> getAllCourses(){	
	return courserepo.findAllCourseNames();
	}
	
	public List<String> getAllTimings(){
		return timingsrepo.findAllTimingsNames();
	}
	
	public void saveStudent(Student student) {
		studentrepo.save(student);
	}
	
	public List<Student> getAllStudentEnquiries() {
        return studentrepo.findAll();
	}
	
}
