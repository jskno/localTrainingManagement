package es.everis.training.view.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.everis.training.service.CourseService;
import es.everis.training.view.course.CourseData;
import es.everis.training.view.course.SimpleCourseData;

@Stateless
@Path("/course")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseResource {
	
	@EJB
	private CourseService courseService;
	
	@GET 
    public List<CourseData> get() {
    	return CourseData.toData(courseService.findAllOrderByDescription());
    }
    
    @GET 
    @Path("{id}")
    public List<CourseData> get(@PathParam("id") Long id) {
    	List<CourseData> courseDataList = new ArrayList<CourseData>();
    	courseDataList.add(CourseData.toData(courseService.findById(id)));
    	return courseDataList;
    }
    
    @POST
    public void save(SimpleCourseData courseData) {
    	courseService.insert(SimpleCourseData.fromData(courseData));
    }
    
    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
    	courseService.removeById(id);
    }

}
