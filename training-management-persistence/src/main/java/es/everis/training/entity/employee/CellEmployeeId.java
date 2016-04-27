package es.everis.training.entity.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CellEmployeeId implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="DEPARTAMENT_ID")
	private Short departamentId;
	
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;

	public Short getDepartamentId() {
		return departamentId;
	}

	public void setDepartamentId(Short departamentId) {
		this.departamentId = departamentId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departamentId == null) ? 0 : departamentId.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellEmployeeId other = (CellEmployeeId) obj;
		if (departamentId == null) {
			if (other.departamentId != null)
				return false;
		} else if (!departamentId.equals(other.departamentId))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
	
}
