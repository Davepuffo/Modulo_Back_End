package esercizio;

public class Elemento {
		
	private String codiceISBN;
	private String titolo;
	private int anno;
	private int nPagine;
	
	public Elemento(String codiceISBN, String titolo, int anno, int nPagine) {
		this.codiceISBN = codiceISBN;
		this.titolo = titolo;
		this.anno = anno;
		this.nPagine = nPagine;
	}

	public String getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(String codiceISBN) {
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
	
	
}
