/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Material;

import java.util.ArrayList;

/**
 *
 * @author Qualidade
 */
public class Quimica {
    
    private ArrayList<Caracteristica> caracteristica = new ArrayList<Caracteristica>();
    
    public Quimica(Caracteristica... caracteristicas){
        for(Caracteristica caract: caracteristicas){
            caracteristica.add(caract);
        }
    }
    
    class Caracteristica{
        private String quimica;
        private float valor;
        Caracteristica(String quimica, float valor){
            this.quimica = quimica;
            this.valor = valor;
        }

        public String getQuimica() {
            return quimica;
        }

        public void setQuimica(String quimica) {
            this.quimica = quimica;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }
        
    }
    
}
