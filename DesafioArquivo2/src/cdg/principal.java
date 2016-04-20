/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg;

import java.util.ArrayList;

/**
 *
 * @author ilegra
 */
public class principal {
     public static void main(String[]args) throws Exception{
        
         ArrayList<Votacao> guarda = new ArrayList();
         
        String caminho = "src\\Cdg\\votos.txt";
        ManipulaArquivo c = new ManipulaArquivo();
        
        guarda = c.LeArquivo(caminho);
        c.contaVotos(guarda);
        c.estadoMaisVotado(guarda);   
    }
    
}
