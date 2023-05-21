package dao;

import java.util.List;

import model.Elemento;
import model.Utente;

public interface IUtenteDAO {

	public void save(Utente e);
	public Utente getById(int id);
	public void delete(int numeroTessera);
	public void update(Utente e);
	public List<Utente> getAll();
	
}
