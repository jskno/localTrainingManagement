package es.everis.training.view.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.everis.training.entity.employee.Employee;

@XmlRootElement
public class EmployeeData {
	
	private Integer id;
	private Integer employeeNumber;
	private String name;
	private String surname;
	private EmployeeProfileData employeeProfileData;
	private DepartamentData departamentData;
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
	public EmployeeProfileData getEmployeeProfileData() {
		return employeeProfileData;
	}
	public void setEmployeeProfileData(EmployeeProfileData employeeProfileData) {
		this.employeeProfileData = employeeProfileData;
	}
	public DepartamentData getDepartamentData() {
		return departamentData;
	}
	public void setDepartamentData(DepartamentData departamentData) {
		this.departamentData = departamentData;
	}
	
	public static EmployeeData toData(Employee employee) {
		EmployeeData empData = new EmployeeData();
		empData.setId(employee.getId());
		empData.setEmployeeNumber(employee.getEmployeeNumber());
		empData.setName(employee.getName());
		empData.setSurname(employee.getSurname());
		empData.setEmail(employee.getEmail());
		empData.setIncorporationDate(employee.getIncorporationDate());
		empData.setEmployeeProfileData(EmployeeProfileData.toData(employee.getEmployeeProfile()));
		empData.setDepartamentData(DepartamentData.toData(employee.getDepartament()));
		return empData;
	}
	
	public static List<EmployeeData> toData(List<Employee> employees) {
		List<EmployeeData> employeesData = new ArrayList<EmployeeData>();
		for(Employee employee : employees) {
			employeesData.add(toData(employee));
		}
		return employeesData;
	}
	
	public static Employee fromData(EmployeeData empData) {
		Employee employee = new Employee();
		employee.setId(empData.getId());
		employee.setEmployeeNumber(empData.getEmployeeNumber());
		employee.setName(empData.getName());
		employee.setSurname(empData.getSurname());
		employee.setEmail(empData.getEmail());
		employee.setIncorporationDate(empData.getIncorporationDate());
		if(null != empData.getEmployeeProfileData()) {
			employee.setEmployeeProfile(EmployeeProfileData.fromData(empData.getEmployeeProfileData()));
		}
		if(null != empData.getDepartamentData()) {
			employee.setDepartament(DepartamentData.fromData(empData.getDepartamentData()));
		}
		return employee;
	}
	
	public static List<Employee> fromData(List<EmployeeData> empsData) {
		List<Employee> emps = new ArrayList<Employee>();
		for(EmployeeData empData : empsData) {
			emps.add(fromData(empData));
		}
		return emps;
	}

}
