package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Timings {

	@Id
	private Integer timing_Id;
	
	private String timing_Name;

	public Integer getTiming_Id() {
		return timing_Id;
	}

	public void setTiming_Id(Integer timing_Id) {
		this.timing_Id = timing_Id;
	}

	public String getTiming_Name() {
		return timing_Name;
	}

	public void setTiming_Name(String timing_Name) {
		this.timing_Name = timing_Name;
	}

	@Override
	public String toString() {
		return "Timings [timing_Id=" + timing_Id + ", timing_Name=" + timing_Name + "]";
	}
	
	
}
