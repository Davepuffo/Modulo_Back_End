package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "elementi")
public class Elemento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer codiceISBN;
	@Column(nullable = false)
	private String titolo;
	@Column(nullable = false)
	private int anno;
	@Column(nullable = false, name= "numero_pagine")
	private int nPagine;
	
	public Elemento() {
		super();
	}

	public Elemento(String titolo, int anno, int nPagine) {
		super();
		this.titolo = titolo;
		this.anno = anno;
		this.nPagine = nPagine;
	}
	
	public Integer getCodiceISBN() {
		return codiceISBN;
	}
	public void setCodiceISBN(Integer codiceISBN) {
		this.codiceISBN = codiceISBN;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getnPagine() {
		return nPagine;
	}
	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}
	
	@Override
	public String toString() {
		return "Elemento [codiceISBN=" + codiceISBN + ", titolo=" + titolo + ", anno=" + anno + ", nPagine=" + nPagine
				+ "]";
	}
	
}
