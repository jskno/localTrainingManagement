package es.everis.training.view.employee;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.employee.Cell;
import es.everis.training.entity.employee.Departament;

@XmlRootElement
public class DepartamentData {
	
	private Short id;
	private DepartamentTypeData departamentTypeData;
	private EmployeeData managerData;
	private DepartamentData fatherDepartamentData;
	private List<DepartamentData> subordinatesData;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public DepartamentTypeData getDepartamentTypeData() {
		return departamentTypeData;
	}

	public void setDepartamentTypeData(DepartamentTypeData departamentTypeData) {
		this.departamentTypeData = departamentTypeData;
	}

	public EmployeeData getManagerData() {
		return managerData;
	}

	public void setManagerData(EmployeeData managerData) {
		this.managerData = managerData;
	}

	public DepartamentData getFatherDepartamentData() {
		return fatherDepartamentData;
	}

	public void setFatherDepartamentData(DepartamentData fatherDepartamentData) {
		this.fatherDepartamentData = fatherDepartamentData;
	}

	public List<DepartamentData> getSubordinatesData() {
		return subordinatesData;
	}

	public void setSubordinatesData(List<DepartamentData> subordinatesData) {
		this.subordinatesData = subordinatesData;
	}

	public static DepartamentData toData(Departament dept) {
		DepartamentData depData = new DepartamentData();
		depData.setId(dept.getId());
		depData.setDepartamentTypeData(DepartamentTypeData.toData(dept.getDepartamentType()));
		depData.setManagerData(EmployeeData.toData(dept.getManager()));
		depData.setFatherDepartamentData(toData(dept.getFatherDepartament()));
		depData.setSubordinatesData(toData(dept.getSubordinates()));
		return depData;
	}
	
	public static List<DepartamentData> toData(List<Departament> depts) {
		List<DepartamentData> deptsData = new ArrayList<DepartamentData>();
		for(Departament dept : depts) {
			deptsData.add(toData(dept));
		}
		return deptsData;
	}
	
	public static Departament fromData(DepartamentData deptData) {
		if(null != deptData) {
			Departament dept = new Departament();
			dept.setId(deptData.getId());
			if(null != deptData.getDepartamentTypeData()) {
				dept.setDepartamentType(DepartamentTypeData.fromData(deptData.getDepartamentTypeData()));
			}
			if(null != deptData.getManagerData()) {
				dept.setManager(EmployeeData.fromData(deptData.getManagerData()));
			}
			if(null != deptData.getFatherDepartamentData()) {
				dept.setFatherDepartament(DepartamentData.fromData(deptData.getFatherDepartamentData()));
			}
			if(null != deptData.getSubordinatesData()) {
				dept.setSubordinates(fromData(deptData.getSubordinatesData()));
			}
			return dept;
		} else {
			return null;
		}
	}
	
	public static List<Departament> fromData(List<DepartamentData> deptsData) {
		List<Departament> depts = new ArrayList<Departament>();
		for(DepartamentData deptData : deptsData) {
			depts.add(fromData(deptData));
		}
		return depts;
	}

}
