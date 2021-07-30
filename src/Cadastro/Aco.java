/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.io.Serializable;

/**
 *
 * @author Qualidade
 */
public class Aco implements Serializable{

    private String nome, grau,bitola;

    private Quimica quimica;
    private Fisica fisica;
   
    
    
    public Aco(String nome, String grau, String bitola, Quimica quimica, Fisica fisica) {
        this.nome = nome;
        this.grau = grau;
        this.bitola = bitola;
        this.quimica = quimica;
        this.fisica = fisica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getBitola() {
        return bitola;
    }

    public void setBitola(String bitola) {
        this.bitola = bitola;
    }

    public Quimica getQuimica() {
       return quimica;
    }

    public void setQuimica(Quimica quimica) {
        this.quimica = quimica;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }
    
    

}
