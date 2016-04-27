package es.everis.training.entity.employee;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CENTERS")
@DiscriminatorValue(value="DEPARTAMENT_TYPE_ID")
@PrimaryKeyJoinColumn(name="ID")
public class Center extends Departament {
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESPONSABLE_FORMACION_ID", referencedColumnName="ID")
	private Employee responsableFormacion;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="RESPONSABLE_OCU_ID", referencedColumnName="ID")
	private Employee responsableOCU;
	
	public Employee getResponsableFormacion() {
		return responsableFormacion;
	}

	public void setResponsableFormacion(Employee responsableFormacion) {
		this.responsableFormacion = responsableFormacion;
	}

	public Employee getResponsableOCU() {
		return responsableOCU;
	}

	public void setResponsableOCU(Employee responsableOCU) {
		this.responsableOCU = responsableOCU;
	}
	
}
