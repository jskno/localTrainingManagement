//package es.everis.training.test.service;
//
//import java.io.File;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.ejb.embeddable.EJBContainer;
//import javax.naming.NamingException;
//
//import org.junit.Assert;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import es.everis.training.dao.CourseCallDao;
//import es.everis.training.service.CourseCallService;
//import es.everis.training.entity.course.CourseCall;
//
//public class CourseCallServiceTest {
//
//	private CourseCallService courseService;
//
//	private static EJBContainer container;
//
//
//	@BeforeClass
//	public static void setUpClass() throws Exception {
//
//		Map<String, Object> properties = new HashMap<String, Object>();
//		properties.put(EJBContainer.MODULES, new File("target/classes"));
//		properties.put("org.glassfish.ejb.embedded.glassfish.installation.root", "C:/BMW/oracleGlassfish3/glassfish");
//		container = EJBContainer.createEJBContainer(properties);
//
//		System.out.println("Opening the container");
//
//	}
//
//	@AfterClass
//	public static void tearDownClass() throws Exception {
//		container.close();
//		System.out.println("Closing the container");
//	}
//
//	@Before
//	public void setUp() throws NamingException {
//		courseService = (CourseCallService) container.getContext().lookup("java:global/classes/CourseCallService");
//		System.out.println("****setUp");
//	}
//
//	@After
//	public void end() {
//		System.out.println("****end");
//	}
//	
//	@Test
//	public void testSaveCourseCall() {
//		CourseCall course, course2;
//		courseService.saveCourseCall(course);
//		course2 = courseService.findCourseCallById(course.getId());
//		
//		Assert.assertNotNull(course2);	
//		
//	}
//	
//	@Test
//	public void testFindById() {
//		CourseCall course, course2;
//		courseService.saveCourseCall(course);
//		course2 = courseService.findCourseCallById(course.getId());
//		
//		Assert.assertEquals("Element doesn't match, seek failed" ,course, course2);
//	}
//	
//	@Test
//	public void testSearch() {
//		CourseCallFilter courseFilter;
//		List<CourseCall> courses = courseService.searchCourseCalls(courseFilter);
//	}
//	
//	@Test
//	public void testRemoveCourseCallById() {
//		CourseCall course, course2, course3;
//		courseService.saveCourseCall(course);
//		course2 = courseService.findCourseCallById(course.getId());
//		
//		if (course2 != null) {
//			courseService.saveCourseCall(course2);
//			course3 = courseService.findCourseCallById(course2.getId());
//			Assert.assertNull(course3);
//		} else {
//			Assert.fail();
//		}
//		
//	}
//
//
//}
