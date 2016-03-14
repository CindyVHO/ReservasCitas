/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tentityManagerplate file, choose Tools | TentityManagerplates
 * and open the tentityManagerplate in the editor.*/
 
package co.edu.uniandes.entitymanager;

import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/*
 * Clase que contiene el manejo del entityManager para la persistencia
 * de las entidades
 * @author Cindy Hernández
 */
public abstract class GeneralPersistence <T> {

    @PersistenceContext(unitName = "ReservasCitasPU")
    protected EntityManager entityManager;
    
    protected Class<T> entityClass;
    
    public int count() {
        Query count = entityManager.createQuery("select count(u) from " + entityClass.getSimpleName() + " u");
        return Integer.parseInt(count.getSingleResult().toString());
    }
     
    public T create(T entity){
        entityManager.persist(entity);
        return entity;
    }
    
    public T update(T entity){
        return entityManager.merge(entity);
    }
     
    public void delete(Long id) {
        T entity = entityManager.find(entityClass, id);
        entityManager.remove(entity);
    }
    
    public T find(Long id){
        return entityManager.find(entityClass, id);
    }
    
    public List<T> findAll() {
        Query q = entityManager.createQuery("select u from " + entityClass.getSimpleName() + " u");
        return q.getResultList();
    }
    
    public List<T> findAll(Integer page, Integer maxRecords) {
        Query q = entityManager.createQuery("select u from " + entityClass.getSimpleName() + " u");
        if (page != null && maxRecords != null) {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        return q.getResultList();
    }

    public<V> List<V> executeListNamedQuery(String name){
        return entityManager.createNamedQuery(name).getResultList();
    }
     
    public<V> List<V> executeListNamedQuery(String name, Map<String,Object> params){
        Query q = entityManager.createNamedQuery(name);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            q.setParameter(entry.getKey(), entry.getValue());
        }
        return q.getResultList();
    }
    
    public<V> V executeSingleNamedQuery(String name){
        return (V)entityManager.createNamedQuery(name).getSingleResult();
    }

    public<V> V executeSingleNamedQuery(String name, Map<String,Object> params){
        Query q = entityManager.createNamedQuery(name);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            q.setParameter(entry.getKey(), entry.getValue());
        }
        return (V)q.getSingleResult();
    }

    public List<T> findByName(String name){
        Query q = entityManager.createQuery("select u from " + entityClass.getSimpleName() + " u where u.name like :name");
        q.setParameter("name", "%"+name+"%");
        return q.getResultList();
    }
}
