package es.everis.training.entity.course;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import es.everis.training.entity.employee.EmployeeProfile;

@Entity
@Table(name="COURSES")
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COURSE_ID")
	private Long courseId;
	
	private String description;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="COURSE_TYPE_ID")
	private CourseType courseType;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="PROFILES_OF_COURSE",
			joinColumns=@JoinColumn(name="COURSE_ID"),
			inverseJoinColumns=@JoinColumn(name="PROFILE_ID"))
	private List<EmployeeProfile> profiles;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MANAGER_ID")
	private CourseManager manager;
	
	@Column(name="EXIST_CONTENT")
	private Boolean existContent;
	
	private byte[] content;
	@Column(name="CONTENT_DESCRIPTION")
	private String contentDescription;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="REMOVED_DATE")
	private Date removedDate;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public List<EmployeeProfile> getProfiles() {
		if(profiles == null || profiles.isEmpty()) {
			return new ArrayList<EmployeeProfile>();
		} else {
			return profiles;
		}
	}
	public void setProfiles(List<EmployeeProfile> profiles) {
		this.profiles = profiles;
	}
	public CourseManager getManager() {
		return manager;
	}
	public void setManager(CourseManager manager) {
		this.manager = manager;
	}
	public Boolean getExistContent() {
		return existContent;
	}
	public void setExistContent(Boolean existContent) {
		this.existContent = existContent;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getContentDescription() {
		return contentDescription;
	}
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}
	public Date getRemovedDate() {
		return removedDate;
	}
	public void setRemovedDate(Date removedDate) {
		this.removedDate = removedDate;
	}
	
}
