package in.ashokit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;



public interface StudentRepo extends JpaRepository<Student,Integer> {

}
