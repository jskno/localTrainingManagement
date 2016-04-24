package es.everis.training.dao.course;

import java.util.List;

import javax.ejb.Stateless;

import es.everis.training.entity.course.Call;
import es.everis.training.filter.CourseCallFilter;

//@RequestScoped
@Stateless
public class CourseCallDao extends GenericDao<Call>{

	public List<Call> findPlannedCalls() {
		// try it out with constants
		return find("Select model from " + getEntityName() + "as model"
				+ "where model.courseCallStatus.name = 'PLANNED'");
	}

	public List<Call> searchByFilter(CourseCallFilter courseCallFilter) {
		return null;
	}

	public Call findCourseCallSameState(Call courseCall) {
		return null;
	}

}
