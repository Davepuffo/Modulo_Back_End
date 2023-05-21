package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Elemento;
import utils.JpaUtil;

public class ElementoDAO implements IElementoDAO {

	@Override
	public void save(Elemento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(ev);
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
	public void delete(int codiceISBN) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Elemento el = em.find(Elemento.class, codiceISBN);
			em.remove(el);
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
	public Elemento getByISBN(int codiceISBN) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Elemento evt =  em.find(Elemento.class, codiceISBN);
			em.getTransaction().commit();
			return evt;
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su salvataggio!!");
			return null;
		} finally {
			em.close();
		}
	}
	
	@Override
	public List<Elemento> getByYear(int anno) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("elementoPerAnno");
			q.setParameter("prmt", anno);
			return q.getResultList();
		} finally {
			em.close();
		}
	}
	
	@Override
	public void update(Elemento ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(ev);
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
	public List<Elemento> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("tuttiElementi");
			return q.getResultList();
		} finally {
			em.close();
		}
	}

	@Override
	public List<Elemento> getByAuthor(String autore) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("elementoPerAutore");
			q.setParameter("prmt", autore);
			return q.getResultList();
		} 	catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Nessun rusultato per questo autore!");
			return null;
		}	finally {
			em.close();
		}
	}


	@Override
	public List<Elemento> getByTitle(String titolo) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createNamedQuery("elementoPerTitolo");
			q.setParameter("prmt", "%"+titolo+"%");
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
