package es.everis.training.dao.course;

import java.util.List;

import javax.ejb.Stateless;

import es.everis.training.entity.course.Course;
import es.everis.training.filter.CourseFilter;

//@RequestScoped
@Stateless
public class CourseDao extends GenericDao<Course> {
	
	public List<Course> findAllOrderByDescription() {
		return find("Select model from " + getEntityName() + " as model "
				+ "order by model.description");
	}

	public Course findCourseByDescription(String description) {
		return null;
	}

	public List<Course> searchCourses(CourseFilter courseFilter) {
		return null;
	}
	
	

}
