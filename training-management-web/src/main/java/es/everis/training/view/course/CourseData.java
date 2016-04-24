package es.everis.training.view.course;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.course.Course;

@XmlRootElement
public class CourseData {
	
	private Long courseId;
	private String description;
	private CourseTypeData courseTypeData;
	private List<EmployeeProfileData> profilesData;
	private CourseManagerData courseManager;
	private Boolean existContent;
	private String contentDescription;
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long id) {
		this.courseId = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public CourseTypeData getCourseTypeData() {
		return courseTypeData;
	}
	public void setCourseType(CourseTypeData courseTypeData) {
		this.courseTypeData = courseTypeData;
	}
	public List<EmployeeProfileData> getProfilesData() {
		if(profilesData == null || profilesData.isEmpty()) {
			return new ArrayList<EmployeeProfileData>();
		} else {
			return profilesData;
		}
	}
	public void setProfilesData(List<EmployeeProfileData> profilesData) {
		this.profilesData = profilesData;
	}
	public Boolean getExistContent() {
		return existContent;
	}
	public void setExistContent(Boolean existContent) {
		this.existContent = existContent;
	}
	public String getContentDescription() {
		return contentDescription;
	}
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}
	public CourseManagerData getCourseManager() {
		return courseManager;
	}
	public void setCourseManager(CourseManagerData courseManager) {
		this.courseManager = courseManager;
	}
	public void setCourseTypeData(CourseTypeData courseTypeData) {
		this.courseTypeData = courseTypeData;
	}
	
	public static CourseData toData(Course course) {
		if (course == null) {
			return null;
		}
		CourseData courseData = new CourseData();
		courseData.setCourseId(course.getCourseId());
		courseData.setDescription(course.getDescription());
		if(course.getCourseType() != null) {
			courseData.setCourseType(CourseTypeData.toData(course.getCourseType()));
		}
		courseData.setCourseManager(CourseManagerData.toData(course.getManager()));
		courseData.setExistContent(course.getExistContent());
		courseData.setContentDescription(course.getContentDescription());
		if (course.getProfiles() != null && !course.getProfiles().isEmpty()) {
			courseData.setProfilesData(EmployeeProfileData.toData(course.getProfiles()));
		}
		return courseData;
	}

	public static List<CourseData> toData(List<Course> courses) {
		List<CourseData> courseDataList = new ArrayList<CourseData>();
		for (Course course : courses) {
			courseDataList.add(toData(course));
		}
		return courseDataList;
	}

	public static Course fromData(CourseData courseData) {
		if (courseData == null) {
			return null;
		}
		Course course = new Course();
		course.setCourseId(courseData.getCourseId());
		course.setDescription(courseData.getDescription());
		
		// If the object attribute is null to avoid an insert not set the attribute at all
		if(courseData.getCourseTypeData() != null) {
		course.setCourseType(CourseTypeData.fromData(courseData.getCourseTypeData()));
		}
		course.setManager(CourseManagerData.fromData(courseData.getCourseManager()));
		course.setExistContent(courseData.getExistContent());
		course.setContentDescription(courseData.getContentDescription());
		if(courseData.getProfilesData() != null) {
			course.setProfiles(EmployeeProfileData.fromData(courseData.getProfilesData()));
		}
		return course;
	}
	
	public static List<Course> fromData(List<CourseData> courses) {
		List<Course> courseList = new ArrayList<Course>();
		for (CourseData course : courses) {
			courseList.add(fromData(course));
		}
		return courseList;
	}
	

	
	
	
	

}
