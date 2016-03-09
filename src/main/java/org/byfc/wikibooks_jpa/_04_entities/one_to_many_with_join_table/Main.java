/*
 * See https://en.wikibooks.org/wiki/Java_Persistence/OneToOne
 */
package org.byfc.wikibooks_jpa._04_entities.one_to_many_with_join_table;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

            emf = Persistence.createEntityManagerFactory("one_to_many_with_join_table_PU");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            ////////////////////
            Phone phone1 = new Phone();
            phone1.setArea_code("705");
            phone1.setPhonenumber("1234567");
            phone1.setType("work");

            Phone phone2 = new Phone();
            phone2.setArea_code("705");
            phone2.setPhonenumber("7654321");
            phone2.setType("mobile");

            Employee employee = new Employee();
            employee.setFirstName("Fred");
            employee.setLastName("Carella");
            
            // maintain bi-directional relationship
            employee.addPhone(phone1);
            employee.addPhone(phone2);

            phone1.setOwner(employee);
            phone2.setOwner(employee);

            em.persist(employee);
            em.persist(phone1);
            em.persist(phone2);
            ////////////////////
            em.getTransaction().commit();

            Phone phoneCopy = em.find(Phone.class, phone1.getId());
            System.out.println(phoneCopy.getPhonenumber() + " is the phone number for " + phoneCopy.getOwner().getFirstName());
            
            
            for(Phone p:phoneCopy.getOwner().getPhones()){
                System.out.println(p.getOwner().getFirstName()+"'s "+ p.getType() +" number is "+p.getPhonenumber());
            }
            // Not bi-directional, cant get employee from address
            //addressCopy.getEmployee();

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
