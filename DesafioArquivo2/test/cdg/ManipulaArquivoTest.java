/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ilegra
 */
public class ManipulaArquivoTest {
    
    @Test
    public void testContaVotos() throws Exception {
        
        String caminhoArquivo="src\\Cdg\\votos.txt";
        
               
        ArrayList<Votacao> dadosArq = new ArrayList();
        
        ManipulaArquivo testa = new ManipulaArquivo();
        
        dadosArq = testa.LeArquivo(caminhoArquivo);
        
        ArrayList result = testa.contaVotos(dadosArq);
        
        ArrayList expResult = new ArrayList();
      
                
       expResult.add(10);
       expResult.add(5);
        
        
        assertEquals(expResult, result);
      
    }

 
    
}
