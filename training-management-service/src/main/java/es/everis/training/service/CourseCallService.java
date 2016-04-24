package es.everis.training.service;

import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import es.everis.training.dao.course.CourseCallDao;
import es.everis.training.entity.course.Call;
import es.everis.training.entity.course.CallStatus;
import es.everis.training.exceptions.ValidationException;
import es.everis.training.filter.CourseCallFilter;
import es.everis.training.service.util.Messages;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CourseCallService {
	
	private ResourceBundle MSG = ResourceBundle.getBundle(Messages.BUNDLE_BUSINESS_MESSAGES);
	
	@Inject 
	private CourseCallDao courseCallDao;
	
	public void saveCourseCall(Call courseCall) {
		validateCourseCall(courseCall);
		if(null == courseCall.getCourseCallId()) {
			setStatus(courseCall);
			courseCallDao.addEntity(courseCall);
		} else {
			courseCallDao.updateEntity(courseCall);
		}
	}
	
	public Call findCourseCallById(Long id) {
		return courseCallDao.findById(id);
	}
	
	public List<Call> findAllCourseCalls() {
		return courseCallDao.findAll();
//		return searchCourseCalls(null);
	}
	
	public List<Call> searchCourseCalls(CourseCallFilter courseCallFilter) {
		return courseCallDao.searchByFilter(courseCallFilter);
	}
	
	public List<Call> findPlannedCalls() {
		return courseCallDao.findPlannedCalls();
	}

	// Physically
	public void removeCourseCallById(Long id) {
		courseCallDao.removeById(id);
	}

	// Logically
	public void removeById(Long id) {
		Call courseCall = findCourseCallById(id);
		courseCall.setRemovedDate(new Date());
		courseCallDao.updateEntity(courseCall);
	}
	
	public void insert(Call courseCall) {
		courseCallDao.addEntity(courseCall);
//		update(courseCall);
	}
	
	public void update(Call courseCall) {
		courseCallDao.updateEntity(courseCall);
	}

	private void setStatus(Call courseCall) {
		CallStatus courseCallStatusPlanned = new CallStatus();
		courseCallStatusPlanned.setId(Short.parseShort("1"));
		courseCall.setCourseCallStatus(courseCallStatusPlanned);
	}
	
	private void validateCourseCall(Call courseCall) {
		validateUniqueState(courseCall);
	}
	
	private void validateUniqueState(Call courseCall){
		Call other = courseCallDao.findCourseCallSameState(courseCall);
		if (other != null && !other.getCourseCallId().equals(courseCall.getCourseCallId())){
			throw new ValidationException(MSG.getString(
					Messages.COURSE_VALIDATION_DESCRIPTION_DUPLICATE));
		}
	}
 

}
