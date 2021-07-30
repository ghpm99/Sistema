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
public class Dimensional implements Serializable{

    //normal mm
    private String unidade;

    private String chavePol;

    /**
     * s = chave h = altura cabeca D = diametro cabeca b = compr. rosca l = comprimento d = diametro
     */
    private float dMin, dMax, hMin, hMax, lMin, lMax, bMin, bMax, DMin, DMax, sMin, sMAx, s, h, D, b, l, d;

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getChavePol() {
        return chavePol;
    }

    public void setChavePol(String chavePol) {
        this.chavePol = chavePol;
    }

    public float getdMin() {
        return dMin;
    }

    public void setdMin(float dMin) {
        this.dMin = dMin;
    }

    public float getdMax() {
        return dMax;
    }

    public void setdMax(float dMax) {
        this.dMax = dMax;
    }

    public float gethMin() {
        return hMin;
    }

    public void sethMin(float hMin) {
        this.hMin = hMin;
    }

    public float gethMax() {
        return hMax;
    }

    public void sethMax(float hMax) {
        this.hMax = hMax;
    }

    public float getlMin() {
        return lMin;
    }

    public void setlMin(float lMin) {
        this.lMin = lMin;
    }

    public float getlMax() {
        return lMax;
    }

    public void setlMax(float lMax) {
        this.lMax = lMax;
    }

    public float getbMin() {
        return bMin;
    }

    public void setbMin(float bMin) {
        this.bMin = bMin;
    }

    public float getbMax() {
        return bMax;
    }

    public void setbMax(float bMax) {
        this.bMax = bMax;
    }

    public float getDMin() {
        return DMin;
    }

    public void setDMin(float DMin) {
        this.DMin = DMin;
    }

    public float getDMax() {
        return DMax;
    }

    public void setDMax(float DMax) {
        this.DMax = DMax;
    }

    public float getsMin() {
        return sMin;
    }

    public void setsMin(float sMin) {
        this.sMin = sMin;
    }

    public float getsMAx() {
        return sMAx;
    }

    public void setsMAx(float sMAx) {
        this.sMAx = sMAx;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getD() {
        return D;
    }

    public void setD(float D) {
        this.D = D;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    public float getd(){
        return d;
    }
    
    public void setd(float d){
        this.d = d;
    }
    
}
