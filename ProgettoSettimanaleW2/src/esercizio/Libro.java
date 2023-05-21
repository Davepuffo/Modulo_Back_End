package esercizio;

public class Libro extends Elemento {
	
	private String autore;
	private String genere;
	
	public Libro(String codiceISBN, String titolo, int anno, int nPagine, String autore, String genere) {
		super(codiceISBN, titolo, anno, nPagine);
		this.autore = autore;
		this.genere = genere;
	}

	
	@Override
	public String getCodiceISBN() {
		// TODO Auto-generated method stub
		return super.getCodiceISBN();
	}



	@Override
	public void setCodiceISBN(String codiceISBN) {
		// TODO Auto-generated method stub
		super.setCodiceISBN(codiceISBN);
	}



	@Override
	public String getTitolo() {
		// TODO Auto-generated method stub
		return super.getTitolo();
	}



	@Override
	public void setTitolo(String titolo) {
		// TODO Auto-generated method stub
		super.setTitolo(titolo);
	}



	@Override
	public int getAnno() {
		// TODO Auto-generated method stub
		return super.getAnno();
	}



	@Override
	public void setAnno(int anno) {
		// TODO Auto-generated method stub
		super.setAnno(anno);
	}



	@Override
	public int getnPagine() {
		// TODO Auto-generated method stub
		return super.getnPagine();
	}

	@Override
	public void setnPagine(int nPagine) {
		// TODO Auto-generated method stub
		super.setnPagine(nPagine);
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro: [CodiceISBN= " + getCodiceISBN()
				+ ", Titolo= " + getTitolo() + ", Anno= " + getAnno() + ", Numero Pagine= " + getnPagine()
				+ ", Autore= " + getAutore() + ", Genere= " + getGenere() + "]! ";
	}
	

}
