package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Elemento;
import model.Prestito;
import utils.JpaUtil;

public class PrestitoDAO implements IPrestitoDAO {
	
	@Override
	public void save(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
			System.out.println("Elemento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
	}


	@Override
	public void delete(int idPrestito) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Prestito u = em.find(Prestito.class, idPrestito);
			em.remove(u);
			em.getTransaction().commit();
			System.out.println("Elemento cancellato dal DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
	}
	
	@Override
	public Prestito getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Prestito p =  em.find(Prestito.class, id);
			em.getTransaction().commit();
			return p;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
			return null;
		} finally {
			em.close();
		}
	}

	@Override
	public void update(Prestito p) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(p);
			em.getTransaction().commit();
			System.out.println("Evento salvato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
		} finally {
			em.close();
		}
	}

	@Override
	public List<Prestito> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("tuttiPrestiti");
			return q.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public List<Prestito> elementiInPrestito(int numeroTessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT p FROM Prestito p WHERE p.dataRestituzioneEffettiva = null AND p.utente =" + numeroTessera);
			return q.getResultList();
		} 	catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Nessun rusultato per questo titolo!");
			return null;
		}	finally {
			em.close();
		}
	}


	@Override
	public List<Prestito> elementiScaduti() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT p FROM Prestito p WHERE p.dataRestituzioneEffettiva = null AND NOW() > p.dataRestituzionePrevista");
			return q.getResultList();
		} 	catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Nessun rusultato per questo titolo!");
			return null;
		}	finally {
			em.close();
		}
	}

}
