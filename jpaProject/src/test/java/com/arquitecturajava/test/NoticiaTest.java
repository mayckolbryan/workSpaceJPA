/**
 * 
 */
package com.arquitecturajava.test;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

/**
 * @author User
 *
 */
public class NoticiaTest {
	EntityManagerFactory emf;
	EntityManager em;
	
	@Before
	public void iniciar(){
		Persistence.generateSchema("curso", null);
		emf = Persistence.createEntityManagerFactory("curso");
	}
	
	@Test
	public void entityManagerFactoryOK(){
		assertNotNull(emf);
	}
}
