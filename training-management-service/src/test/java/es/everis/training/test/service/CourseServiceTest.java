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
//import es.everis.training.dao.CourseDao;
//import es.everis.training.service.CourseService;
//import es.everis.training.entity.course.Course;
//
//public class CourseServiceTest {
//
//	private CourseService courseService;
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
//		courseService = (CourseService) container.getContext().lookup("java:global/classes/CourseService");
//		System.out.println("****setUp");
//	}
//
//	@After
//	public void end() {
//		System.out.println("****end");
//	}
//	
//	@Test
//	public void testSaveCourse() {
//		Course course, course2;
//		courseService.saveCourse(course);
//		course2 = courseService.findCourseById(course.getId());
//		
//		Assert.assertNotNull(course2);	
//		
//	}
//	
//	@Test
//	public void testFindById() {
//		Course course, course2;
//		courseService.saveCourse(course);
//		course2 = courseService.findCourseById(course.getId());
//		
//		Assert.assertEquals("Element doesn't match, seek failed" ,course, course2);
//	}
//	
//	@Test
//	public void testSearch() {
//		CourseFilter courseFilter;
//		List<Course> courses = courseService.searchCourses(courseFilter);
//	}
//	
//	@Test
//	public void testRemoveCourseById() {
//		Course course, course2, course3;
//		courseService.saveCourse(course);
//		course2 = courseService.findCourseById(course.getId());
//		
//		if (course2 != null) {
//			courseService.saveCourse(course2);
//			course3 = courseService.findCourseById(course2.getId());
//			Assert.assertNull(course3);
//		} else {
//			Assert.fail();
//		}
//		
//	}
//
//
//}