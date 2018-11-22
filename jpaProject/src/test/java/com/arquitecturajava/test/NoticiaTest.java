/**
 * 
 */
package com.arquitecturajava.test;

import javax.persistence.Persistence;

/**
 * @author User
 *
 */
public class NoticiaTest {
	public void iniciar(){
		Persistence.generateSchema("curso", null);
	}
}
