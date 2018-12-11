/**
 * 
 */
package com.arquitecturajava.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
public class NoticiaTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	public void iniciar(){
//		Persistence.generateSchema("curso", null);
		emf = Persistence.createEntityManagerFactory("curso");
		em = emf.createEntityManager();
	}
	
	@Test
	public void entityManagerFactoryOK(){
		assertNotNull(emf);
	}
	
	@Test
	public void borrarNoticiaInicial(){
		Noticia noticia = em.find(Noticia.class, "hola");
		em.getTransaction().begin();
		em.remove(noticia);
		em.getTransaction().commit();
		Noticia sinNoticia = em.find(Noticia.class, "hola");
		assertNull(sinNoticia);
	}
}
