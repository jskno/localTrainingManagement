package es.everis.training.view.course;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.employee.EmployeeProfile;

@XmlRootElement
public class EmployeeProfileData {

	private Short profileId;
	private String profileDescription;
	public Short getPositionId() {
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
	
	public static EmployeeProfileData toData(EmployeeProfile position) {
		EmployeeProfileData positionData = new EmployeeProfileData();
		positionData.setProfileId(position.getProfileId());
		positionData.setProfileDescription(position.getProfileDescription());
		return positionData;
	}
	
	public static List<EmployeeProfileData> toData(List<EmployeeProfile> positions) {
		if(positions == null || positions.isEmpty()) {
			return new ArrayList<EmployeeProfileData>();
		} else {
			List<EmployeeProfileData> positionsData = new ArrayList<EmployeeProfileData>();
			for(EmployeeProfile position : positions) {
				positionsData.add(EmployeeProfileData.toData(position));
			}
			return positionsData;
		}
	}
	
	public static EmployeeProfile fromData(EmployeeProfileData positionData) {
		EmployeeProfile position = new EmployeeProfile();
		if(positionData != null) {
			position.setProfileId(positionData.getPositionId());
			position.setProfileDescription(positionData.getProfileDescription());
		}
		return position;
	}
	
	public static List<EmployeeProfile> fromData(List<EmployeeProfileData> positionsData) {
		if(positionsData == null | positionsData.isEmpty()) {
			return new ArrayList<EmployeeProfile>();
		} else {
			List<EmployeeProfile> positions = new ArrayList<EmployeeProfile>();
			for(EmployeeProfileData positionData : positionsData) {
				positions.add(EmployeeProfileData.fromData(positionData));
			}
			return positions;
		}
	}

	
}
