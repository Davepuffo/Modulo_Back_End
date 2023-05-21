package dao;

import java.util.List;

import model.Elemento;
import model.Prestito;

public interface IPrestitoDAO {

	public void save(Prestito p);
	public Prestito getById(int id);
	public void delete(int idPrestito);
	public void update(Prestito e);
	public List<Prestito> getAll();
	public List<Prestito> elementiInPrestito(int numeroTessera);
	public List<Prestito> elementiScaduti();
}
