/*
 * See https://en.wikibooks.org/wiki/Java_Persistence/OneToOne
 */
package org.byfc.wikibooks_jpa._06_entities.many_to_many_bidirectional;

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

            emf = Persistence.createEntityManagerFactory("many_to_many_bidirectional_PU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            ////////////////////
            Employee employee = new Employee();
            employee.setFirstName("Employee1");
            employee.setLastName("Number1");
            
            Employee employee2 = new Employee();
            employee2.setFirstName("Employee2");
            employee2.setLastName("Number2");
            
            Project project1=new Project();
            project1.setName("GIS");
            Project project2=new Project();
            project2.setName("SIG");
            
            employee.addProject(project1);
            project1.addEmployee(employee);
            employee.addProject(project2);
            project2.addEmployee(employee);
            // should only get added once
            employee.addProject(project2);
            project2.addEmployee(employee);

            employee2.addProject(project1);
            project1.addEmployee(employee2);
            
            
            em.persist(employee);
            em.persist(employee2);
            em.persist(project1);
            em.persist(project2);
            ////////////////////
            em.getTransaction().commit();

            TypedQuery<Employee> query = em.createQuery("select e from Employee e", Employee.class);
            List<Employee> results = query.getResultList();
            for(Employee e:results){
                for(Project p:e.getProjects()){
                    System.out.println(e.getFirstName()+" is involved in project "+p.getName());
                }
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
