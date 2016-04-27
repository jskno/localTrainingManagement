package es.everis.training.entity.employee;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYESS_CELLS")
public class CellEmployee {
	
	@EmbeddedId
	private CellEmployeeId cellEmployeeId;
	
	private Short percentage;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Cell cell;
	
	@ManyToOne
	private Employee employee;
	
	public CellEmployee() {}
	
	public CellEmployee(Cell cell, Employee employee) {
		this.cell = cell;
		this.cellEmployeeId.setDepartamentId(cell.getId());
		
		this.employee = employee;
		this.cellEmployeeId.setEmployeeId(employee.getId());
	}

	public CellEmployeeId getCellEmployeeId() {
		return cellEmployeeId;
	}

	public void setCellEmployeeId(CellEmployeeId cellEmployeeId) {
		this.cellEmployeeId = cellEmployeeId;
	}

	public Short getPercentage() {
		return percentage;
	}

	public void setPercentage(Short percentage) {
		this.percentage = percentage;
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
