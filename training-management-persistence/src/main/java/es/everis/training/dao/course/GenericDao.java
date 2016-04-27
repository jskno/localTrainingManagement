package es.everis.training.dao.course;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import es.everis.training.util.GenericClassHelper;

//@RequestScoped
@Stateless
public class GenericDao<E> {
	
	protected Class<E> entityClass;
	protected String entityName;
	
	@PersistenceContext
	protected EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public Class<E> getEntityClass() {
		if (entityClass == null) {
			entityClass = (Class<E>)GenericClassHelper.
					getFirstArgument(this, GenericDao.class);
		}
		return entityClass;
	}
	
	public String getEntityName() {
		if (entityName == null) {
			entityName = getEntityClass().getSimpleName();
		}
		return entityName;
	}
	
	public void addEntity(E entity) {
		entityManager.persist(entity);
		entityManager.flush();
	}
	
	public void removeEntity(E entity) {
//		entityManager.remove(entityManager.merge(entity));
		entityManager.remove(entity);
		entityManager.flush();
	}
	
	public E updateEntity(E entity) {
		E e = entityManager.merge(entity);
		entityManager.flush();
		return e;
	}
	
	public E findById(Serializable primaryKey) {
		return entityManager.find(getEntityClass(), primaryKey);
	}
	
	public List<E> findAll() {
		return find("Select model from " + getEntityName() + " as model");
	}
	
	@SuppressWarnings("unchecked")
	protected List<E> find(String sql) {
		Query queryObject = entityManager.createQuery(sql);
		return queryObject.getResultList();
		
	}
	
	public void removeById(Serializable id) {
		removeEntity(findById(id));
	}
	
	protected EntityManager getEntityManager() {
		return entityManager;
	};
}

