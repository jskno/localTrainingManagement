package es.everis.training.view.employee;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.employee.DepartamentType;

@XmlRootElement
public class DepartamentTypeData {
	
	private Short id;
	private String name; // Centro, Línea, Celda
	
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static DepartamentTypeData toData(DepartamentType depType) {
		DepartamentTypeData depTypeData = new DepartamentTypeData();
		depTypeData.setId(depType.getId());
		depTypeData.setName(depType.getName());
		return depTypeData;
	}
	
	public static List<DepartamentTypeData> toData(List<DepartamentType> depTypes) {
		List<DepartamentTypeData> depTypesData = new ArrayList<DepartamentTypeData>();
		for(DepartamentType depType : depTypes) {
			depTypesData.add(DepartamentTypeData.toData(depType));
		}
		return depTypesData;
	}
	
	public static DepartamentType fromData(DepartamentTypeData depTypeData) {
		DepartamentType depType = new DepartamentType();
		depType.setId(depTypeData.getId());
		depType.setName(depTypeData.getName());
		return depType;
	}

}
