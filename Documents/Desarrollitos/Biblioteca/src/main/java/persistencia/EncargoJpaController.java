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
import logica.Encargo;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author USER
 */
public class EncargoJpaController implements Serializable {

    public EncargoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public EncargoJpaController() {
        emf = Persistence.createEntityManagerFactory("Libreria_PU");
    }

    public void create(Encargo encargo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(encargo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Encargo encargo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            encargo = em.merge(encargo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = encargo.getIdEncargo();
                if (findEncargo(id) == null) {
                    throw new NonexistentEntityException("The encargo with id " + id + " no longer exists.");
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
            Encargo encargo;
            try {
                encargo = em.getReference(Encargo.class, id);
                encargo.getIdEncargo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The encargo with id " + id + " no longer exists.", enfe);
            }
            em.remove(encargo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Encargo> findEncargoEntities() {
        return findEncargoEntities(true, -1, -1);
    }

    public List<Encargo> findEncargoEntities(int maxResults, int firstResult) {
        return findEncargoEntities(false, maxResults, firstResult);
    }

    private List<Encargo> findEncargoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Encargo.class));
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

    public Encargo findEncargo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Encargo.class, id);
        } finally {
            em.close();
        }
    }

    public int getEncargoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Encargo> rt = cq.from(Encargo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
