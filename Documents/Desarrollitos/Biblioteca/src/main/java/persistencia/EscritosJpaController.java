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
import logica.Escritos;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author USER
 */
public class EscritosJpaController implements Serializable {

    public EscritosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public EscritosJpaController() {
        emf = Persistence.createEntityManagerFactory("Libreria_PU");
    }

    public void create(Escritos escritos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(escritos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Escritos escritos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            escritos = em.merge(escritos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = escritos.getIdEscritos();
                if (findEscritos(id) == null) {
                    throw new NonexistentEntityException("The escritos with id " + id + " no longer exists.");
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
            Escritos escritos;
            try {
                escritos = em.getReference(Escritos.class, id);
                escritos.getIdEscritos();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The escritos with id " + id + " no longer exists.", enfe);
            }
            em.remove(escritos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Escritos> findEscritosEntities() {
        return findEscritosEntities(true, -1, -1);
    }

    public List<Escritos> findEscritosEntities(int maxResults, int firstResult) {
        return findEscritosEntities(false, maxResults, firstResult);
    }

    private List<Escritos> findEscritosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Escritos.class));
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

    public Escritos findEscritos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Escritos.class, id);
        } finally {
            em.close();
        }
    }

    public int getEscritosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Escritos> rt = cq.from(Escritos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
