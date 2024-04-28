package in.ashokit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Timings;

public interface TimingsRepo extends JpaRepository<Timings,Integer>{

	@Query("SELECT t.timing_Name FROM Timings t")
	List<String> findAllTimingsNames();
}
