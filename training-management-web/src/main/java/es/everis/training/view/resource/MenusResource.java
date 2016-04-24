package es.everis.training.view.resource;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.everis.training.service.DropMenusService;
import es.everis.training.view.course.CourseTypeData;
import es.everis.training.view.course.MenusData;
import es.everis.training.view.course.EmployeeProfileData;

@Stateless
@Path("/menus")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MenusResource {
	
	@EJB
	private DropMenusService menusService;
	
	@GET
    public MenusData get() {
		List<CourseTypeData> types = CourseTypeData.toData(menusService.getCouseTypes());
		List<EmployeeProfileData> positions = EmployeeProfileData.toData(menusService.getPositions());
		return new MenusData(types, positions);
    }

}
