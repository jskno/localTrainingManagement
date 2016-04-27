package es.everis.training.entity.employee;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CELLS")
@DiscriminatorValue(value="DEPARTAMENT_TYPE_ID")
@PrimaryKeyJoinColumn(name="ID")
public class Cell extends Departament {
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cell")
	private List<CellEmployee> cellEmployees;

	public List<CellEmployee> getEmployeesCells() {
		return cellEmployees;
	}

	public void setEmployeesCells(List<CellEmployee> cellEmployees) {
		this.cellEmployees = cellEmployees;
	}

}
