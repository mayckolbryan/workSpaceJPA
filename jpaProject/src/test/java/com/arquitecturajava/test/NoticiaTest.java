/**
 * 
 */
package com.arquitecturajava.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.arquitecturajava.bo.Noticia;

/**
 * @author User
 *
 */
public class NoticiaTest extends JPAUnitTest{
//	EntityManagerFactory emf;
//	EntityManager em;
//	
//	@Before
//	public void iniciar(){
////		Persistence.generateSchema("curso", null);
//		emf = Persistence.createEntityManagerFactory("curso");
//		em = emf.createEntityManager();
//	}
	
//	@Test
	public void entityManagerFactoryOK(){
		assertNotNull(emf);
	}
	
//	@Test
	public void borrarNoticiaInicial(){
		Noticia noticia = em.find(Noticia.class, "hola");
		em.getTransaction().begin();
		em.remove(noticia);
		em.getTransaction().commit();
		Noticia sinNoticia = em.find(Noticia.class, "hola");
		assertNull(sinNoticia);
	}
	
//	@Test
	public void insertarNoticia(){
		Noticia noticia = new Noticia("primera noticia", "enrique", new Date());
		em.getTransaction().begin();
		em.persist(noticia);
		em.getTransaction().commit();
		Noticia noticiaInsertada = em.find(Noticia.class, "primera noticia");
	}
	
	@Test
	public void buscarNoticiaInicial(){
		Noticia noticia = em.find(Noticia.class, "primera noticia");
		assertNull(noticia);
	}
}
