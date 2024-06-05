/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Escritor;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author USER
 */
public class EscritorJpaController implements Serializable {

    public EscritorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public EscritorJpaController() {
        emf = Persistence.createEntityManagerFactory("Libreria_PU");
    }

    public void create(Escritor escritor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(escritor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Escritor escritor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            escritor = em.merge(escritor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = escritor.getIdEscritor();
                if (findEscritor(id) == null) {
                    throw new NonexistentEntityException("The escritor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Escritor escritor;
            try {
                escritor = em.getReference(Escritor.class, id);
                escritor.getIdEscritor();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The escritor with id " + id + " no longer exists.", enfe);
            }
            em.remove(escritor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Escritor> findEscritorEntities() {
        return findEscritorEntities(true, -1, -1);
    }

    public List<Escritor> findEscritorEntities(int maxResults, int firstResult) {
        return findEscritorEntities(false, maxResults, firstResult);
    }

    private List<Escritor> findEscritorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Escritor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Escritor findEscritor(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Escritor.class, id);
        } finally {
            em.close();
        }
    }

    public int getEscritorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Escritor> rt = cq.from(Escritor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
