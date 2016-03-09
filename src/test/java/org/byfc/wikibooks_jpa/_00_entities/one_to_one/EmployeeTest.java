/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.byfc.wikibooks_jpa._00_entities.one_to_one;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author malexander
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Employee.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Employee.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Employee instance = new Employee();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @org.junit.Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Employee instance = new Employee();
        Address expResult = null;
        Address result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @org.junit.Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Address address = null;
        Employee instance = new Employee();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @org.junit.Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @org.junit.Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Employee instance = new Employee();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Employee.
     */
    @org.junit.Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @org.junit.Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Employee instance = new Employee();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @org.junit.Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Employee instance = new Employee();
        Double expResult = null;
        Double result = instance.getSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class Employee.
     */
    @org.junit.Test
    public void testSetSalary() {
        System.out.println("setSalary");
        Double salary = null;
        Employee instance = new Employee();
        instance.setSalary(salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
