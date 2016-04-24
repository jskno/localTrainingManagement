package es.everis.training.view.course;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.course.CourseManager;

@XmlRootElement
public class CourseManagerData {
	
	private Integer managerId;
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
	
	public static CourseManagerData toData(CourseManager courseManager) {
		CourseManagerData courseManagerData = new CourseManagerData();
		courseManagerData.setManagerId(courseManager.getManagerId());
		courseManagerData.setManagerName(courseManager.getManagerName());
		return courseManagerData;
	}

	public static List<CourseManagerData> toData(List<CourseManager> courseManagers) {
		List<CourseManagerData> courseManagersData = new ArrayList<CourseManagerData>();
		for(CourseManager courseManager : courseManagers) {
			courseManagersData.add(toData(courseManager));
		}
		return courseManagersData;
	}
	
	public static CourseManager fromData(CourseManagerData courseManagerData) {
		CourseManager courseManager = new CourseManager();
		courseManager.setManagerId(courseManagerData.getManagerId());
		courseManager.setManagerName(courseManagerData.getManagerName());
		return courseManager;
	}

}
