package es.everis.training.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;

import es.everis.training.entity.employee.Departament;
import es.everis.training.entity.employee.DepartamentType;
import es.everis.training.entity.employee.Employee;
import es.everis.training.entity.employee.Unit;

@Stateless
public class EmployeeService {
	
	public List<Employee> getAllManagers(Departament departament) {
		List<Employee> managers = new ArrayList<Employee>();
		addManagers(managers, departament);
		return managers;
	}
	
	public List<Employee> getTeamManager(Employee manager) {
		List<Employee> subordinates = new ArrayList<Employee>();
		getSubordinates(subordinates, manager.getDepartament());
		return subordinates;
	}
	
	public List<Map<DepartamentType, List<Departament>>> getStructure(Employee employee) {
		List<Map<DepartamentType, List<Departament>>>
			structure = new ArrayList<Map<DepartamentType, List<Departament>>>();
		Departament departament = employee.getDepartament();
		addTopStructure(structure, departament);
		addBottomStructure(structure, departament);
		return structure;
	}
	
	private void addManagers(List<Employee> managers, Departament departament) {
		
		while(departament != null) {
			managers.add(departament.getManager());
			if(null != departament.getSubordinates()) {
				for(Departament subordinate : departament.getSubordinates()) {
					addManagers(managers, subordinate);
				}
			}
		}
	}
	
	private void getSubordinates(List<Employee> subordinates,Departament departament) {
		
		while(departament != null) {
			subordinates.addAll(departament.getEmployees());
			for(Departament subordinate : departament.getSubordinates()) {
				getSubordinates(subordinates, subordinate);
			}
		}
	}
	
	
	private void addTopStructure(List<Map<DepartamentType, List<Departament>>> structure,
													Departament departament) {
		Unit unit = new Unit();
		unit.setDepartaments(departament.getSubordinates());
		unit.setType(departament.getSubordinates().get(0).getDepartamentType());
	}
	
	
	private void addBottomStructure(List<Map<DepartamentType, List<Departament>>> structure,
			Departament departament) {
		while(departament != null) {
			Map<DepartamentType, List<Departament>> structureLevel =
					new HashMap<DepartamentType, List<Departament>>();
			structureLevel.put(departament.getSubordinates().get(0).getDepartamentType(),
					departament.getSubordinates());
			structure.add(structureLevel);
			
			for(Departament subordinate : departament.getSubordinates()) {
				addBottomStructure(structure, subordinate);
			}
		}
	}
	
}
