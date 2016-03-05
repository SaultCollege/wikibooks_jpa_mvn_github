/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byfc.wikibooks_jpa._00_entities.one_to_one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
            emf = Persistence.createEntityManagerFactory("one_to_one_PU");
            em = emf.createEntityManager();

            em.getTransaction().begin();
            ////////////////////
            Address address = new Address();
            address.setCity("Sault Ste Marie");
            address.setCountry("CANADA");
            address.setPostalCode("P6A5L3");
            address.setProvince("Ontario");
            address.setStreet("443 Northern Ave");

            Employee employee = new Employee();
            employee.setFirstName("Fred");
            employee.setLastName("Carella");
            employee.setSalary(1.00);
            employee.setAddress(address);

            em.persist(employee);
            em.persist(address);

            ////////////////////
            em.getTransaction().commit();

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
