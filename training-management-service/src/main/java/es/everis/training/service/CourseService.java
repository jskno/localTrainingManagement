package es.everis.training.service;

import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import es.everis.training.dao.course.CourseDao;
import es.everis.training.entity.course.Course;
import es.everis.training.exceptions.ValidationException;
import es.everis.training.filter.CourseFilter;
import es.everis.training.service.util.Messages;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CourseService {
	
	private ResourceBundle MSG = ResourceBundle.getBundle(Messages.BUNDLE_BUSINESS_MESSAGES);
	
	@Inject
	CourseDao courseDao;

	public void save(Course course) {
		validateCourse(course);
		
		if(null == course.getCourseId()) {
			courseDao.addEntity(course);
		} else {
			courseDao.addEntity(course);
		}
	}

	public void insert(Course course) {
		courseDao.addEntity(course);
//		update(course);
	}
	
	public void update(Course course) {
		courseDao.updateEntity(course);
	}
	
	//Physical remove
	public void removeCourseById(Long id) {
		courseDao.removeById(id);
	}
	
	// Logical remove
	public void removeById(Long id) {
		Course course = findById(id);
		course.setRemovedDate(new Date());
		courseDao.updateEntity(course);
	}
	
	public List<Course> findAllOrderByDescription() {
		return courseDao.findAllOrderByDescription();
	}

	public List<Course> findAllCourses() {
		return searchCourses(null);
	}
	
	public List<Course> searchCourses(CourseFilter courseFilter) {
		return courseDao.searchCourses(courseFilter);
	}
	
	public Course findById(Long id) {
		return courseDao.findById(id);
	}
	
	private void validateCourse(Course course) {
		 validateCourseName(course);
	}
	
	private void validateCourseName(Course course) {
		Course other = courseDao.findCourseByDescription(course.getDescription());
		if(other != null && other.getCourseId() != course.getCourseId()) {
			throw new ValidationException(
					MSG.getString(Messages.COURSE_VALIDATION_DESCRIPTION_DUPLICATE));
		}
	}



}
