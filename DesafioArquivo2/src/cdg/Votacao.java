/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdg;

/**
 *
 * @author ilegra
 */
public class Votacao {
    
    private String nome;
    private String partido;
    private String estado;
    private String votacao;
    
    public Votacao(String nome, String partido, String estado, String votacao){
    
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.votacao = votacao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the partido
     */
    public String getPartido() {
        return partido;
    }

    /**
     * @param partido the partido to set
     */
    public void setPartido(String partido) {
        this.partido = partido;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the votacao
     */
    public String getVotacao() {
        return votacao;
    }

    /**
     * @param votacao the votacao to set
     */
    public void setVotacao(String votacao) {
        this.votacao = votacao;
    }
    
    
    
}
