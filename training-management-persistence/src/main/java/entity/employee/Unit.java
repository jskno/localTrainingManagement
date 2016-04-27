package es.everis.training.entity.employee;

import java.util.List;

public class Unit {
	
	private DepartamentType type;
	private String name;
	private List<Departament> departaments;
	
	public DepartamentType getType() {
		return type;
	}
	public void setType(DepartamentType type) {
		this.type = type;
	}
	
	public List<Departament> getDepartaments() {
		return departaments;
	}
	public void setDepartaments(List<Departament> departaments) {
		this.departaments = departaments;
	}

}
