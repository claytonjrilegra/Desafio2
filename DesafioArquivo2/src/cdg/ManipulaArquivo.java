/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ilegra
 */
public class ManipulaArquivo {
    
    public ManipulaArquivo(){
        
    }
    
    public ArrayList LeArquivo(String CaminhoArquivo) throws Exception{
        //CaminhoArquivo = "src\\Cdg\\vendas.txt";
        
        ArrayList<Votacao> guardaVotos = new ArrayList();
        
        try {
            
             FileReader arquivo = new FileReader(CaminhoArquivo);
             BufferedReader le = new BufferedReader(arquivo);
             
             
             
             String [] temp = new String[4];
             
             String leLinha = le.readLine();
             
             while(leLinha != null){
            
                temp = leLinha.split(";");
                
                Votacao ListaVotos = new Votacao(temp[0], temp[1],temp[2], temp[3]);
                
                guardaVotos.add(ListaVotos);
                
                leLinha = le.readLine();
             }
             
                      
            }catch(Exception e){
                    
            }
             
        return guardaVotos;
    }//Fim leArquivo
    
    
    public ArrayList contaVotos(ArrayList<Votacao> votos){
               
                int contSim = 0;
                int contNao = 0;
                
              ArrayList arrayCont = new ArrayList();
        
            for (int i = 0; i < votos.size(); i++) {
                                             
                

                if(votos.get(i).getVotacao().equalsIgnoreCase("SIM"))
                {
                    contSim++;
                }
                else
                {
                    contNao++;
                }
                
                
            }//Final FOR
            
            arrayCont.add(contSim);
            arrayCont.add(contNao);
            
            
            System.out.println("Total de votos positivos: "+ contSim + "\nTotal "
                    + "de votos negativos: "+ contNao);
            return arrayCont;
    }//FIM contaVotos
    
    public void estadoMaisVotado(ArrayList<Votacao> votos){
        
        

        int primeiroVoto = 1;
        int votonao = 1;
        int i = 0;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        
        
        Integer aux = 0;
        for (Votacao voto: votos) { 

            aux = map.get(voto.getPartido());
            Integer aux2 = map2.get(voto.getPartido());

 //-------------------------- VERIFICA E CONTA OS VOTOS SIM ---------------------------            
            if(aux == null){
                
                if(votos.get(i).getVotacao().equalsIgnoreCase("SIM"))
                {
                    map.put(voto.getPartido(), primeiroVoto);
                }
                        
                
            } else {
                if(votos.get(i).getVotacao().equalsIgnoreCase("SIM"))
                {
                    map.put(voto.getPartido(), aux + primeiroVoto);
                }
            }
 //-------------------------- FIM VERIFICA E CONTA OS VOTOS SIM ---------------------------
    
    
    
  //-------------------------- VERIFICA E CONTA OS VOTOS NÃO ------------------------------
          
          if(aux2 == null){
                
                if(votos.get(i).getVotacao().equalsIgnoreCase("NAO"))
                {
                    map2.put(voto.getPartido(), votonao);
                }
                        
                
            } else {
                if(votos.get(i).getVotacao().equalsIgnoreCase("NAO"))
                {
                    map2.put(voto.getPartido(), aux2 + votonao);
                }
            }
 //-------------------------- FIM TESTA E CONTA OS NÃO ------------------------------         
            i++;
            
            
            
            
        }//final for verifica votos
        
        
        int maiorSim = 0;
        int maiorNao = 0;
        String nomeSim = "";
        String nomeNao = "";
        
        
       for (Votacao voto: votos) {
           
           
           if(map.get(voto.getPartido()) != null)
           {
               if(map.get(voto.getPartido()) > maiorSim)
                {
                    maiorSim = map.get(voto.getPartido());
                    nomeSim = voto.getPartido();         
                }
               
           }
                         
               if(map2.get(voto.getPartido()) != null){
                   
                    if(map2.get(voto.getPartido()) > maiorNao)
                    
                    {
                        maiorNao = map2.get(voto.getPartido());
                        nomeNao = voto.getPartido();   
                    }   
           } 
                    
         
       }
        

        System.out.println("O partido "+ nomeSim + " foi o mais votado e possui " + maiorSim + " votos positivos");
        System.out.println("O partido "+ nomeNao + " obteve " + maiorNao + " votos negativos");
        
    }// Final estadoMaisVotado
    
    
    
}//Final classe
