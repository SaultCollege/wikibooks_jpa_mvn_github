/*
 * See https://en.wikibooks.org/wiki/Java_Persistence/OneToOne
 */
package org.byfc.wikibooks_jpa._07_entities.embedded;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author fred
 */
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            common.Util.createDatabase();

            emf = Persistence.createEntityManagerFactory("embeddable_PU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            ////////////////////
            Employee employee = new Employee();
            employee.setFirstName("Employee1");
            employee.setLastName("Number1");
            
            em.persist(employee);
            ////////////////////
            em.getTransaction().commit();

            TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
            List<Employee> results = query.getResultList();
            for(Employee e:results){
                System.out.println(e.getFirstName()+" started "+e.getPeriod().getStartDate()+" and finished "+e.getPeriod().getEndDate());
            }
            // bidirectional
            

        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (emf != null) {
                emf.close();
            }
//            if(em!=null)
//                em.close();
        }
    }

}
