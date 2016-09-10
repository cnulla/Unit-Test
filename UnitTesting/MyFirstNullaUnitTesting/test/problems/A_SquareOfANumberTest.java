/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 3rdyearaccount
 */
public class A_SquareOfANumberTest {
    
    public A_SquareOfANumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        A_SquareOfANumber.main(args);
        
    }

    @Test
    public void testSquare() {
        System.out.println("square");
        int num = 3;
        int expResult = 9;
        int result = A_SquareOfANumber.square(num);
        assertEquals(expResult, result);
       
    }
    
}
