package es.everis.training.entity.employee;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import es.everis.training.entity.course.Course;

@Entity
@Table(name="EMPLOYEE_PROFILES")
public class EmployeeProfile {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROFILE_ID")
	private Short profileId;
	
	@Column(name="PROFILE_DESCRIPTION")
	private String profileDescription;
	
	@ManyToMany(fetch=FetchType.LAZY, mappedBy="profiles")
	private List<Course> courses;
	
	public Short getProfileId() {
		return profileId;
	}
	public void setProfileId(Short profileId) {
		this.profileId = profileId;
	}
	public String getProfileDescription() {
		return profileDescription;
	}
	public void setProfileDescription(String profileDescription) {
		this.profileDescription = profileDescription;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	
}
