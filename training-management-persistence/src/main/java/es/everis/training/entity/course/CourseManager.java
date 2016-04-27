package es.everis.training.entity.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSES_MANAGERS")
public class CourseManager {
	
	@Id
	@Column(name="MANAGER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer managerId;
	
	@Column(name="MANGER_NAME")
	private String managerName;

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
}
