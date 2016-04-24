//package es.everis.training.init;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//import javax.ejb.EJB;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
//import javax.inject.Inject;
//import javax.sql.DataSource;
//
//import es.everis.training.dao.CourseTypeDao;
//import es.everis.training.dao.PositionDao;
//
//@Singleton
//@Startup 
//public class Carga {
// 
//	@Inject
//	private CourseTypeDao courseTypeDao;
//	
//	@Inject
//	private PositionDao positionDao;
//	
//	@Resource(name="jdbc/curso2")
////	@Resource(name="jdbc/curso")
//	DataSource datasource;
//	
//	@Inject
//	Menus menus;
//	
//	
//	@PostConstruct
//	public void init() {
//		
//		System.out.println("******************** ANTES");
////		createData("/dataOracle.sql");
//		
//		menus.setCourseTypes(courseTypeDao.findAll());
//		System.out.println("********************>> Tipos de Curso cargados");
//		menus.setPositions(positionDao.findAll());
//		System.out.println("********************>> Cargos cargados");
//
//		System.out.println("HECHO");
//	}
//	
//	public void createData(String path) { 
//		Connection connection = null;
//		InputStream input = null;
//		try {
//			
//			System.out.println("[Carga] Preparando DB");
//			
//			input = this.getClass().getResourceAsStream(path);
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			
//			byte[] buffer = new byte[2048];
//			int len;
//			
//			while((len=input.read(buffer))!=-1) {
//				baos.write(buffer, 0, len);
//			}
//			
//			String sql = new String(baos.toByteArray());
//			
//			String[] stmTextArr = sql.split(";");
//			
//			connection = datasource.getConnection();
//			Statement stmt = connection.createStatement();
//
//			for (String stmText : stmTextArr) {
//				stmText = stmText.trim();
//				if (!stmText.isEmpty()) {
//					System.out.println("[Carga] Statement: " + stmText);
//					stmt.addBatch(stmText);
//				}
//			}
//
//			stmt.executeBatch(); 
//			
//			stmt.close(); 
//			
//		} catch (SQLException | IOException e) {
//			throw new RuntimeException(e);
//		} finally {
//			if (connection != null) {
//				try {
//					connection.close(); 
//				} catch (SQLException e) {}
//			}
//			if (input != null) {
//				try {
//					input.close();
//				} catch (IOException e) {}
//			}
//		}
//
//
//	}
//}
