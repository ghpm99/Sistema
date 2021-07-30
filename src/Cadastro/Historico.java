/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.util.Date;

/**
 *
 * @author Qualidade
 */
public class Historico {

    private int numeroCerti, numeroNota;
    private float qnt;
    private String cliente;
    private Date dia;

    public Historico(int numeroCerti, int numeroNota, float qnt, String cliente, Date dia) {
        this.numeroCerti = numeroCerti;
        this.numeroNota = numeroNota;
        this.qnt = qnt;
        this.cliente = cliente;
        this.dia = dia;
    }

    public int getNumeroCerti() {
        return numeroCerti;
    }

    public void setNumeroCerti(int numeroCerti) {
        this.numeroCerti = numeroCerti;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public float getQnt() {
        return qnt;
    }

    public void setQnt(float qnt) {
        this.qnt = qnt;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

}
