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
public class _00_one_to_one {
    
    public _00_one_to_one() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Setup class 1 to 1");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Tear down class 1 to 1");
    }
    
    @Before
    public void setUp() {
        System.out.println("Setup 1 to 1");
    }
    
    @After
    public void tearDown() {
        System.out.println("Teardown 1 to 1");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {}
}
