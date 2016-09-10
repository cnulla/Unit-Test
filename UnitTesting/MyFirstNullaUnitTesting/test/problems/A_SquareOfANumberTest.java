/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static problems.A_SquareOfANumber.square;

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
//        System.out.println("main");
//        String[] args = null;
//        A_SquareOfANumber.main(args);
        
    }

    @Test
    public void testSquare1() throws FileNotFoundException {
        
        Scanner scInput = new Scanner(new File("src/TestCases/A1.in"));
        Scanner scOutput = new Scanner(new File("src/TestCases/A1.out"));
        
        int TestCases = scInput.nextInt();
        while(TestCases > 0){
            int num = scInput.nextInt();
            int actualResult = A_SquareOfANumber.square(num);
            int expectedResult = scOutput.nextInt();
            assertEquals(expectedResult, actualResult);
            TestCases--;
        }
        
        System.out.println("########################");
        System.out.println("Test Case 1: Square Method Test Passed");
        System.out.println("########################");
    }
    
    @Test
    public void testSquare2() throws FileNotFoundException {
       
        Scanner scInput = new Scanner(new File("src/TestCases/A2.in"));
        Scanner scOutput = new Scanner(new File("src/TestCases/A2.out"));
        
        int TestCases = scInput.nextInt();
        while(TestCases > 0){
            int num = scInput.nextInt();
            int actualResult = A_SquareOfANumber.square(num);
            int expectedResult = scOutput.nextInt();
            assertEquals(expectedResult, actualResult);
            TestCases--;
        }
        
        System.out.println("########################");
        System.out.println("Test Case 2: Square Method Test Passed");
        System.out.println("########################");
    }
    @Test
    public void testSquare3() throws FileNotFoundException {
        
        Scanner scInput = new Scanner(new File("src/TestCases/A3.in"));
        Scanner scOutput = new Scanner(new File("src/TestCases/A3.out"));
        
        int TestCases = scInput.nextInt();
        while(TestCases > 0){
            int num = scInput.nextInt();
      
        
            int actualResult = A_SquareOfANumber.square(num);
            int expectedResult = scOutput.nextInt();
            assertEquals(expectedResult, actualResult);
            TestCases--;
        }
        
        System.out.println("########################");
        System.out.println("Test Case 3: Square Method Test Passed");
        System.out.println("########################");
    }
   
    
}
