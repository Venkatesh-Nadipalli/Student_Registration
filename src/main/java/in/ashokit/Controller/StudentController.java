package in.ashokit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.Service.StudentService;
import in.ashokit.entity.Courses;
import in.ashokit.entity.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	
	@GetMapping("/all")
    public String getAllStudents(Model model) {
        List<Student> students = studentservice.getAllStudentEnquiries();
        model.addAttribute("students", students);
        return "studentEnquieryList"; 
    }
	
		 @GetMapping("/registrationForm")
		    public String showRegistrationForm(Model model) {
			 
			 List<Courses> courses = studentservice.getAllCourses();
			 model.addAttribute("Courses",courses);
			 List<String> timings = studentservice.getAllTimings();
			 model.addAttribute("Timings",timings);
			 model.addAttribute("student", new Student());
		     return "registrationForm";
		    }
		 
		 @PostMapping("/processRegistration")
		 public String processRegistration(@ModelAttribute("student") Student student,Model model) {
		        studentservice.saveStudent(student);
		        return "registration-success";
		    }
}
