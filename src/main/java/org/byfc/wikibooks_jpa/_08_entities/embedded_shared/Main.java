/*
 * See https://en.wikibooks.org/wiki/Java_Persistence/OneToOne
 */
package org.byfc.wikibooks_jpa._08_entities.embedded_shared;

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

            emf = Persistence.createEntityManagerFactory("embeddable_shared_PU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            ////////////////////
            Employee employee = new Employee();
            employee.setFirstName("Employee1");
            employee.setLastName("Number1");
            
            em.persist(employee);
            User user = new User();
            user.setFirstName("User1");
            user.setLastName("Number1");
            
            em.persist(user);
            ////////////////////
            em.getTransaction().commit();

            TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
            List<Employee> results = query.getResultList();
            for(Employee e:results){
                System.out.println(e.getFirstName()+" started "+e.getEmploymentPeriod().getStartDate()+" and finished "+e.getEmploymentPeriod().getEndDate());
            }
            TypedQuery<User> query2 = em.createQuery("select e from User e", User.class);
            List<User> results2 = query2.getResultList();
            for(User e:results2){
                System.out.println(e.getFirstName()+" started "+e.getEmploymentPeriod().getStartDate()+" and finished "+e.getEmploymentPeriod().getEndDate());
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
