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
import logica.Curriculum;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author USER
 */
public class CurriculumJpaController implements Serializable {

    public CurriculumJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
     public CurriculumJpaController() {
        emf = Persistence.createEntityManagerFactory("Libreria_PU");
    }
    public void create(Curriculum curriculum) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(curriculum);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Curriculum curriculum) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            curriculum = em.merge(curriculum);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = curriculum.getIdCurriculum();
                if (findCurriculum(id) == null) {
                    throw new NonexistentEntityException("The curriculum with id " + id + " no longer exists.");
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
            Curriculum curriculum;
            try {
                curriculum = em.getReference(Curriculum.class, id);
                curriculum.getIdCurriculum();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The curriculum with id " + id + " no longer exists.", enfe);
            }
            em.remove(curriculum);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Curriculum> findCurriculumEntities() {
        return findCurriculumEntities(true, -1, -1);
    }

    public List<Curriculum> findCurriculumEntities(int maxResults, int firstResult) {
        return findCurriculumEntities(false, maxResults, firstResult);
    }

    private List<Curriculum> findCurriculumEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Curriculum.class));
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

    public Curriculum findCurriculum(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Curriculum.class, id);
        } finally {
            em.close();
        }
    }

    public int getCurriculumCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Curriculum> rt = cq.from(Curriculum.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
