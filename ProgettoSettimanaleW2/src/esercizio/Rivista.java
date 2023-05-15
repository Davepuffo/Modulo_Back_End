package esercizio;

public class Rivista extends Elemento {

		private Periodicità tipo;

		public Rivista(String codiceISBN, String titolo, int anno, int nPagine, Periodicità tipo) {
			super(codiceISBN, titolo, anno, nPagine);
			this.tipo = tipo;
		}
		
		
		public Periodicità getTipo() {
			return tipo;
		}

		public void setTipo(Periodicità tipo) {
			this.tipo = tipo;
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


		@Override
		public String toString() {
			return "Rivista: [CodiceISBN= " + getCodiceISBN()
					+ ", Titolo= " + getTitolo() + ", Periodicità= " + getTipo() +", Anno= " + getAnno() + ", Numero Pagine= " + getnPagine()
					+ "]! ";
		}
		
		
		
		
}
