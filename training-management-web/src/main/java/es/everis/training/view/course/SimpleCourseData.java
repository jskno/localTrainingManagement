package es.everis.training.view.course;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.course.Course;
import es.everis.training.entity.course.CourseManager;
import es.everis.training.entity.course.CourseType;
import es.everis.training.entity.employee.EmployeeProfile;

@XmlRootElement
public class SimpleCourseData {
	
	private Long courseId;
	private String description;
	private Integer courseTypeDataId;
	private List<Short> profilesDataIds;
	private Integer managerId;
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
	public Integer getCourseTypeDataId() {
		return courseTypeDataId;
	}
	public void setCourseTypeDataId(Integer courseTypeDataId) {
		this.courseTypeDataId = courseTypeDataId;
	}
	public List<Short> getProfilesDataIds() {
		if(profilesDataIds == null) {
			return new ArrayList<Short>();
		} else {
			return profilesDataIds;
		}
	}
	public void setProfilesDataIds(List<Short> profilesDataIds) {
		this.profilesDataIds = profilesDataIds;
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
	
	public static SimpleCourseData toData(Course course) {
		if (course == null) {
			return null;
		}
		SimpleCourseData courseData = new SimpleCourseData();
		courseData.setCourseId(course.getCourseId());
		courseData.setDescription(course.getDescription());
		courseData.setCourseTypeDataId(course.getCourseType().getCourseTypeId());
		courseData.setManagerId(course.getManager().getManagerId());
		courseData.setExistContent(course.getExistContent());
		courseData.setContentDescription(course.getContentDescription());
		for(EmployeeProfile profile : course.getProfiles()) {
			courseData.getProfilesDataIds().add(profile.getProfileId());
		}
		return courseData;
	}

	public static List<SimpleCourseData> toData(List<Course> courses) {
		List<SimpleCourseData> courseDataList = new ArrayList<SimpleCourseData>();
		for (Course course : courses) {
			courseDataList.add(toData(course));
		}
		return courseDataList;
	}

	public static Course fromData(SimpleCourseData courseData) {
		if (courseData == null) {
			return null;
		}
		Course course = new Course();
		course.setCourseId(courseData.getCourseId());
		course.setDescription(courseData.getDescription());
		
		// If the object attribute is null to avoid an insert not set the attribute at all
		if(courseData.getCourseTypeDataId() != null) {
			CourseType courseType = new CourseType();
			courseType.setCourseTypeId(courseData.getCourseTypeDataId());
			course.setCourseType(courseType);
		}
		CourseManager courseManager = new CourseManager();
		courseManager.setManagerId(courseData.getManagerId());
		course.setManager(courseManager);
		course.setExistContent(courseData.getExistContent());
		course.setContentDescription(courseData.getContentDescription());
		if(courseData.getProfilesDataIds() != null) {
			List<EmployeeProfile> positions = new ArrayList<EmployeeProfile>();
			for(Short positionId : courseData.getProfilesDataIds()) {
				EmployeeProfile position = new EmployeeProfile();
				position.setProfileId(positionId);
				positions.add(position);
			}
			course.setProfiles(positions);
		}
		return course;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	
	
	
	

}
