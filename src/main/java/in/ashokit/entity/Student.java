package in.ashokit.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stu_Id;
	private String stu_Name;
	private String stu_Email;
	private String stu_Gender;
	private String stu_Courses;
	private List<String> stu_Timings;
	
	
	public Integer getStu_Id() {
		return stu_Id;
	}
	public void setStu_Id(Integer stu_Id) {
		this.stu_Id = stu_Id;
	}
	public String getStu_Name() {
		return stu_Name;
	}
	public void setStu_Name(String stu_Name) {
		this.stu_Name = stu_Name;
	}
	public String getStu_Email() {
		return stu_Email;
	}
	public void setStu_Email(String stu_Email) {
		this.stu_Email = stu_Email;
	}
	public String getStu_Gender() {
		return stu_Gender;
	}
	public void setStu_Gender(String stu_Gender) {
		this.stu_Gender = stu_Gender;
	}
	public String getStu_Courses() {
		return stu_Courses;
	}
	public void setStu_Courses(String stu_Courses) {
		this.stu_Courses = stu_Courses;
	}
	public List<String> getStu_Timings() {
		return stu_Timings;
	}
	public void setStu_Timings(List<String> stu_Timings) {
		this.stu_Timings = stu_Timings;
	}
	
	@Override
	public String toString() {
		return "Student [stu_Id=" + stu_Id + ", stu_Name=" + stu_Name + ", stu_Email=" + stu_Email + ", stu_Gender="
				+ stu_Gender + ", stu_Courses=" + stu_Courses + ", stu_Timings=" + stu_Timings + "]";
	}
	
	
	
	
	
}
