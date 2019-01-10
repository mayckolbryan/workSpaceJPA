/**
 * 
 */
package com.arquitecturajava.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author User
 *
 */
@Entity
@Table(name="COMENTARIO", schema="HR")
public class Comentario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="TEXTO")
	private String texto;
	
	@Column(name="AUTOR")
	private String autor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="noticia_titulo")
	private Noticia noticia;
	
	public Comentario() {
		super();
	}
	
	public Comentario(int id, String texto, String autor, Noticia noticia) {
		super();
		this.id = id;
		this.texto = texto;
		this.autor = autor;
		this.noticia = noticia;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}
	
}
