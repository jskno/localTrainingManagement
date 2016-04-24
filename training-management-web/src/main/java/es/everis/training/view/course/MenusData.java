package es.everis.training.view.course;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MenusData {
	
	private List<CourseTypeData> types;
	private List<EmployeeProfileData> positions;
	
	public MenusData() {}
	
	public MenusData(List<CourseTypeData> types, List<EmployeeProfileData> positions) {
		this.types = types;
		this.positions = positions;
	}
	
	public List<CourseTypeData> getTypes() {
		return types;
	}
	public void setTypes(List<CourseTypeData> types) {
		this.types = types;
	}
	public List<EmployeeProfileData> getPositions() {
		return positions;
	}
	public void setPositions(List<EmployeeProfileData> positions) {
		this.positions = positions;
	}
	
	

}
