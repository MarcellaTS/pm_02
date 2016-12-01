
package distancias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcella e priscila
 */
public class LevenshteinCalculatorTest {
    
    public LevenshteinCalculatorTest() {
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
     * Test of distanciaEntrePalavras method, of class LevenshteinCalculator.
     */
    @Test
    public void testdistanciaEntrePalavras() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "a";
        String palavra_dois = "as";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 1;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test2distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "a";
        String palavra_dois = "asa";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 2;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test3distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "preocupar";
        String palavra_dois = "ocupar";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 3;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test4distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "idealizado";
        String palavra_dois = "ideal";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 5;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test5distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "gostoso";
        String palavra_dois = "gostosa";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 1;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test6distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "cola";
        String palavra_dois = "cone";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 2;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test7distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "embaixador";
        String palavra_dois = "embaixatriz";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 4;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test8distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "embaixatriz";
        String palavra_dois = "embaixador";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 4;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test9distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "";
        String palavra_dois = "embaixador";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 10;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void test10distanciaLevenshtein() {
        System.out.println("DistanciaLevenshtein");
        String palavra_um = "embaixatriz";
        String palavra_dois = "";
        LevenshteinCalculator instance = new LevenshteinCalculator();
        int expResult = 11;
        int result = instance.distanciaEntrePalavras(palavra_um, palavra_dois);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
