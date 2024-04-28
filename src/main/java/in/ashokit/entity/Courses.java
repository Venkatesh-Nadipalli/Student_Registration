package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer course_Id;
	private String course_Name;
	
	public Integer getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	@Override
	public String toString() {
		return "Courses [course_Id=" + course_Id + ", course_Name=" + course_Name + "]";
	}
	
	
}
