package dao;

import java.util.List;

import model.Elemento;

public interface IElementoDAO {

	public void save(Elemento e);
	public void delete(int codiceISBN);
	public Elemento getByISBN(int codiceISBN);
	public List<Elemento> getByYear(int anno);
	public void update(Elemento e);
	public List<Elemento> getByAuthor(String autore);
	public List<Elemento> getByTitle(String autore);
	public List<Elemento> getAll();

}
