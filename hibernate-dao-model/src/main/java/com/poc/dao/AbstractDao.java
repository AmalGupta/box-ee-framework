/**
 * 
 */
package com.poc.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * @author amagupta
 *
 */
public class AbstractDao<T> {
	private HibernateTemplate template;
	private Class<T> type; 
	
	protected Class<T> getParametrisedType(){
		return type;
	}
	
	protected void setParametrisedType(Class<T> classType){
		type = classType;
	}
	
	/**
	 * Save Entity
	 * @param t
	 */
	public void saveEntity(T t){
		template.save(t);
	}

	/**
	 * Update Entity
	 * @param t
	 */
	public void updateEntity(T t){
		template.update(t);
	}
	
	/**
	 * Delete Entity
	 * @param t
	 */
	public void deleteEntity(T t){
		template.delete(t);
	}
	
	/**
	 * GetByIntegerId Entity
	 * @param t
	 */
	public T getByIntegerId(int id){		
		T t = (T) template.get(getParametrisedType(), id);
		return t;
	}
	
	/**
	 * GetByStringId Entity
	 * @param t
	 */
	public T getByStringID(String id){
		T t = (T) template.get(getParametrisedType(), id);
		return t;
	}
	
	public List<T> getAllEntities(){		
		List<T> list = new ArrayList<T>();
		list=template.loadAll(getParametrisedType());
		return list;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
