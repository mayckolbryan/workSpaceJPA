/**
 * 
 */
package com.arquitecturajava.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.arquitecturajava.bo.Comentario;
import com.arquitecturajava.bo.Noticia;

/**
 * @author User
 *
 */
public class ComentarioTest extends JPAUnitTest{
//	EntityManagerFactory emf;
//	EntityManager em;
//	
//	@Before
//	public void iniciar(){
////		Persistence.generateSchema("curso", null);
//		emf = Persistence.createEntityManagerFactory("curso");
//		em = emf.createEntityManager();
//	}
	
	@Test
	public void entityManagerFactoryOK(){
		assertNotNull(emf);
	}

	@Test
	public void seleccionarComentarioInicial(){
		Comentario comentario = em.find(Comentario.class, 1);
		assertEquals("JUAN", comentario.getAutor());
	}

	@Test
	public void seleccionarComentarioDeNoticia(){
		Noticia noticia = em.find(Noticia.class, "primera noticia");
		Comentario comentario = noticia.getComentarios().get(0);
		assertEquals("BIEN!!", comentario.getTexto());
	}
	
	@Test
	public void seleccionarComentarioInicialQuery(){
		int total = em.createQuery("select c from Comentario c").getResultList().size();
		assertEquals(1, total);
	}
}
