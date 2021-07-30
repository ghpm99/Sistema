/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema.Entrada;
import sistema.Saida;

/**
 *
 * @author Qualidade
 */
public class Nota implements Serializable  {

    //variaveis
    private int numero;
    private String cliente;
    private long cnpj;
    private ArrayList<Item> itens = new ArrayList<>();
    private Date diaCadastro, diaAtualizar;

    //construtor
    public Nota(String numero, String cnpj, String cliente, ArrayList<Item> itens) {
        this.numero = Integer.valueOf(numero);
        this.cnpj = Long.valueOf(cnpj);
        this.cliente = cliente;
        this.itens = itens;
    }

    public Date getDiaCadastro() {
        return diaCadastro;
    }

    public void setDiaCadastro(Date diaCadastro) {
        this.diaCadastro = diaCadastro;
    }

    public Date getDiaAtualizar() {
        return diaAtualizar;
    }

    public void setDiaAtualizar(Date diaAtualizar) {
        this.diaAtualizar = diaAtualizar;
    }

    //metodos
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void salvar() {
        try {
            File cadastro = new File("C:\\Emisor\\NOTAS\\" + getNumero() + ".nf");            
            if (!cadastro.exists()) {
                this.diaCadastro = new Date();
                this.diaAtualizar = new Date();
                Saida.salvar(cadastro, this);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Nota carregar(String numero) {
        
        Nota nota = null;
        try {
            nota = (Nota) Entrada.carregar(new File("C:\\Emisor\\NOTAS\\" + numero + ".nf"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nota;
    }

}
