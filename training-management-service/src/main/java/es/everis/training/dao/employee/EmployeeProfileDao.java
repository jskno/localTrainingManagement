package es.everis.training.dao.employee;

import javax.ejb.Stateless;

import es.everis.training.dao.course.GenericDao;
import es.everis.training.entity.employee.EmployeeProfile;

//@RequestScoped
@Stateless
public class EmployeeProfileDao extends GenericDao<EmployeeProfile> {

}
