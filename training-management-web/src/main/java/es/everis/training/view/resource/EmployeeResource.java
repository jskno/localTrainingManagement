package es.everis.training.view.resource;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.everis.training.entity.employee.Departament;
import es.everis.training.service.EmployeeService;
import es.everis.training.view.employee.DepartamentData;
import es.everis.training.view.employee.DepartamentTypeData;
import es.everis.training.view.employee.EmployeeData;

@Stateless
@Path("employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {
	
	@EJB
	private EmployeeService empService;
	
	@GET
	public List<EmployeeData> getAllManagers() {
		DepartamentTypeData dptTypeData = new DepartamentTypeData();
		dptTypeData.setId(Short.valueOf( (short) 1));
		dptTypeData.setName("CENTRO");
		DepartamentData deptData = new DepartamentData();
		deptData.setId(Short.valueOf("1"));
		deptData.setFatherDepartamentData(null);
		deptData.setDepartamentTypeData(dptTypeData);
		EmployeeData manager = new EmployeeData();
		manager.setId(1);
		deptData.setManagerData(manager);
		Departament dept = DepartamentData.fromData(deptData);
		return EmployeeData.toData(empService.getAllManagers(dept));
	}

}
