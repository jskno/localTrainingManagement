package es.everis.training.entity.employee;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTAMENTS")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="DEPARTAMENT_TYPE_ID",
		discriminatorType=DiscriminatorType.INTEGER, length=1)
public class Departament {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DEPARTAMENT_TYPE_ID", referencedColumnName="ID")
	private DepartamentType departamentType;
	
	private String name;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MANAGER_ID", referencedColumnName="ID")
	private Employee manager;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FATHER_DEPARTAMENT_ID", referencedColumnName="ID")
	private Departament fatherDepartament;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.REFRESH, mappedBy="fatherDepartament")
	private List<Departament> subordinates;
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Employee> employees;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public DepartamentType getDepartamentType() {
		return departamentType;
	}

	public void setDepartamentType(DepartamentType departamentType) {
		this.departamentType = departamentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Departament getFatherDepartament() {
		return fatherDepartament;
	}

	public void setFatherDepartament(Departament fatherDepartament) {
		this.fatherDepartament = fatherDepartament;
	}

	public List<Departament> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Departament> subordinates) {
		this.subordinates = subordinates;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
