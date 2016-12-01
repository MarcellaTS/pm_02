
package arquivos;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


/**
 *
 * @author marcella e priscila
 */
public class DescompactarZipTest {
    
    public DescompactarZipTest() {
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
     * Test of extrairConteudoZip method, of class DescompactarZip.
     */
    @org.junit.Test
    public void testextrairConteudoZip() throws IOException {
        System.out.println("ExtrairConteudoZip");
        String nome_arquivo = "dictionary_pt-br.zip";
        DescompactarZip instance = new DescompactarZip();
        instance.extrairConteudoZip(nome_arquivo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
