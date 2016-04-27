package es.everis.training.entity.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTAMENT_TYPES")
public class DepartamentType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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

}
