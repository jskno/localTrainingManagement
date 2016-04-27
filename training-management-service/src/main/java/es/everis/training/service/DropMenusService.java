package es.everis.training.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import es.everis.training.dao.course.CourseCallStatusDao;
import es.everis.training.dao.course.CourseManagerDao;
import es.everis.training.dao.course.CourseTypeDao;
import es.everis.training.dao.employee.CenterDao;
import es.everis.training.dao.employee.EmployeeProfileDao;
import es.everis.training.entity.course.CallStatus;
import es.everis.training.entity.course.CourseManager;
import es.everis.training.entity.course.CourseType;
import es.everis.training.entity.employee.Center;
import es.everis.training.entity.employee.EmployeeProfile;

@Stateless
public class DropMenusService {
	
	@Inject
	private CourseCallStatusDao statusDao;
	@Inject
	private CourseManagerDao courseManagerDao;
	@Inject
	private CenterDao coursePlaceDao;
	@Inject
	private CourseTypeDao courseTypeDao;
	@Inject
	private EmployeeProfileDao positionDao;
	
	public List<CallStatus> getCouseCallStatuses() {
		return statusDao.findAll();
	}
	
	public List<CourseManager> getCouseManagers() {
		return courseManagerDao.findAll();
	}
	
	public List<Center> getCousePlaces() {
		return coursePlaceDao.findAll();
	}
	
	public List<CourseType> getCouseTypes() {
		return courseTypeDao.findAll();
	}
	
	public List<EmployeeProfile> getPositions() {
		return positionDao.findAll();
	}
}
