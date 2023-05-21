package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Utente;
import utils.JpaUtil;

public class UtenteDAO implements IUtenteDAO {

	@Override
	public void save(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(u);
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
	public void delete(int numeroTessera) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Utente u = em.find(Utente.class, numeroTessera);
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
	public void update(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(u);
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
	public List<Utente> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("tuttiUtenti");
			return q.getResultList();
		} finally {
			em.close();
		}
	}


	@Override
	public Utente getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Utente u =  em.find(Utente.class, id);
			em.getTransaction().commit();
			return u;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
			return null;
		} finally {
			em.close();
		}
	}
	
}
