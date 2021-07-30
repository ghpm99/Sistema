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
public class Fisica implements Serializable{

  
    private String durezaUni, resistenciaUnid, tensaoUni, alongamUni, estricUni;

    private float durezaMin, durezaMax, resistenciaMin, resistenciaMax, tensaoMin, tensaoMax, alongamMin, alongamMax, estricMin, estricMax;

    public String getDurezaUni() {
        return durezaUni;
    }

    public void setDurezaUni(String durezaUni) {
        
        this.durezaUni = durezaUni;
    }

    public String getResistenciaUnid() {
        return resistenciaUnid;
    }

    public void setResistenciaUnid(String resistenciaUnid) {
        this.resistenciaUnid = resistenciaUnid;
    }

    public String getTensaoUni() {
        return tensaoUni;
    }

    public void setTensaoUni(String tensaoUni) {
        this.tensaoUni = tensaoUni;
    }

    public String getAlongamUni() {
        return alongamUni;
    }

    public void setAlongamUni(String alongamUni) {
        this.alongamUni = alongamUni;
    }

    public String getEstricUni() {
        return estricUni;
    }

    public void setEstricUni(String estricUni) {
        this.estricUni = estricUni;
    }

    public float getDurezaMin() {
        return durezaMin;
    }

    public void setDurezaMin(float durezaMin) {
        this.durezaMin = durezaMin;
    }

    public float getDurezaMax() {
        return durezaMax;
    }

    public void setDurezaMax(float durezaMax) {
        this.durezaMax = durezaMax;
    }

    public float getResistenciaMin() {
        return resistenciaMin;
    }

    public void setResistenciaMin(float resistenciaMin) {
        this.resistenciaMin = resistenciaMin;
    }

    public float getResistenciaMax() {
        return resistenciaMax;
    }

    public void setResistenciaMax(float resistenciaMax) {
        this.resistenciaMax = resistenciaMax;
    }

    public float getTensaoMin() {
        return tensaoMin;
    }

    public void setTensaoMin(float tensaoMin) {
        this.tensaoMin = tensaoMin;
    }

    public float getTensaoMax() {
        return tensaoMax;
    }

    public void setTensaoMax(float tensaoMax) {
        this.tensaoMax = tensaoMax;
    }

    public float getAlongamMin() {
        return alongamMin;
    }

    public void setAlongamMin(float alongamMin) {
        this.alongamMin = alongamMin;
    }

    public float getAlongamMax() {
        return alongamMax;
    }

    public void setAlongamMax(float alongamMax) {
        this.alongamMax = alongamMax;
    }

    public float getEstricMin() {
        return estricMin;
    }

    public void setEstricMin(float estricMin) {
        this.estricMin = estricMin;
    }

    public float getEstricMax() {
        return estricMax;
    }

    public void setEstricMax(float estricMax) {
        this.estricMax = estricMax;
    }

}
