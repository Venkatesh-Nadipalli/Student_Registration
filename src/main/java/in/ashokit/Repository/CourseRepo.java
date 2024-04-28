package in.ashokit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Courses;

public interface CourseRepo extends JpaRepository<Courses,Integer>{

	@Query("SELECT c.course_Name FROM Courses c")
	List<Courses> findAllCourseNames();
}
