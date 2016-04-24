package es.everis.training.view.course;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.course.CourseType;

@XmlRootElement
public class CourseTypeData {
	
	private Integer courseTypeId;
	private String courseTypeDescription;
	
	public Integer getCourseTypeId() {
		return courseTypeId;
	}
	public void setCourseTypeId(Integer courseTypeId) {
		this.courseTypeId = courseTypeId;
	}
	public String getCourseTypeDescription() {
		return courseTypeDescription;
	}
	public void setCourseTypeDescription(String courseTypeDescription) {
		this.courseTypeDescription = courseTypeDescription;
	}
	
	public static CourseTypeData toData(CourseType courseType) {
		if(courseType == null) {
			return null;
		} else {
			CourseTypeData courseTypeData = new CourseTypeData();
			courseTypeData.setCourseTypeId(courseType.getCourseTypeId());
			courseTypeData.setCourseTypeDescription(courseType.getCourseTypeDescription());
			return courseTypeData;
		}
	}
	
	public static List<CourseTypeData> toData(List<CourseType> courseTypes) {
		if(courseTypes == null | courseTypes.isEmpty()) {
			return new ArrayList<CourseTypeData>();
		} else {
			List<CourseTypeData> courseTypesData = new ArrayList<CourseTypeData>();
			for(CourseType courseType : courseTypes) {
				courseTypesData.add(CourseTypeData.toData(courseType));
			}
			return courseTypesData;
		}
	}
	
	public static CourseType fromData(CourseTypeData courseTypeData) {
		CourseType courseType = new CourseType();
		if(courseTypeData != null) {
			courseType.setCourseTypeId(courseTypeData.getCourseTypeId());
			courseType.setCourseTypeDescription(courseTypeData.getCourseTypeDescription());
		}
		return courseType;
	}

}
