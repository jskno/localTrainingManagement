package es.everis.training.view.employee;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.employee.EmployeeProfile;
import es.everis.training.view.course.CourseData;

@XmlRootElement
public class EmployeeProfileData {
	
	private Short profileId;
	private String profileDescription;
	private List<CourseData> courses;
	
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
	public List<CourseData> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseData> courses) {
		this.courses = courses;
	}
	
	public static EmployeeProfileData toData(EmployeeProfile employeeProf) {
		EmployeeProfileData employeeProfData = new EmployeeProfileData();
		employeeProfData.setProfileId(employeeProf.getProfileId());
		employeeProfData.setProfileDescription(employeeProf.getProfileDescription());
		employeeProfData.setCourses(CourseData.toData(employeeProf.getCourses()));
		return employeeProfData;
	}
	
	public static List<EmployeeProfileData> toData(List<EmployeeProfile> employeesProf) {
		List<EmployeeProfileData> employeesProfData = new ArrayList<EmployeeProfileData>();
		for(EmployeeProfile employeeProf : employeesProf) {
			employeesProfData.add(EmployeeProfileData.toData(employeeProf));
		}
		return employeesProfData;
	}
	
	public static EmployeeProfile fromData(EmployeeProfileData employeeProfData) {
		if(employeeProfData != null) {
			EmployeeProfile employeeProf = new EmployeeProfile();
			employeeProf.setProfileId(employeeProfData.getProfileId());
			employeeProf.setProfileDescription(employeeProfData.getProfileDescription());
			employeeProf.setCourses(CourseData.fromData(employeeProfData.getCourses()));
			return employeeProf;
		} else {
			return null;
		}
	}
	
}
