
package arquivos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author marcella e priscila
 */
public class DictionaryReaderTest {
    
    public DictionaryReaderTest() {
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
     * Test of loadFromFile method, of class DictionaryReader.
     */
    @Test
    public void testLoadFromFile() {
        System.out.println("LerTxt");
        String NomeArquivo = "dictionary pt-br.dic";
        DictionaryReader instance = new DictionaryReader();
        instance.loadFromFile(NomeArquivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
