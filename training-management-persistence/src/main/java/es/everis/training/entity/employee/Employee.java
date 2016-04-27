package es.everis.training.entity.employee;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EMPLOYEES")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="EMPLOYEE_NUMBER")
	private Integer employeeNumber;
	
	private String name;
	private String surname;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="PROFILE_ID")
	private EmployeeProfile employeeProfile;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DEPARTAMENT_ID", referencedColumnName="ID")
	private Cell cell;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="INCORPORATION_DATE")
	private Date incorporationDate;
	
	private String email;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public EmployeeProfile getEmployeeProfile() {
		return employeeProfile;
	}
	public void setEmployeeProfile(EmployeeProfile employeeProfile) {
		this.employeeProfile = employeeProfile;
	}
	public Cell getCell() {
		return cell;
	}
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	public Date getIncorporationDate() {
		return incorporationDate;
	}
	public void setIncorporationDate(Date incorporationDate) {
		this.incorporationDate = incorporationDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
