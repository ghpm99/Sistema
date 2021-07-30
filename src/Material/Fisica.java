/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Material;

import Material.Unidades.Unidade;
import java.util.ArrayList;

/**
 *
 * @author Qualidade
 */
public class Fisica {

    Fisica(Caracteristica... arg0) {
        for (Caracteristica a : arg0) {
            caracteristicas.add(a);
        }
    }
    
    private ArrayList<Caracteristica> caracteristicas = new ArrayList<>();
    
    class Caracteristica {

         private float min, max;
         private String caracteristica;
         private Unidade unidade;
        
        Caracteristica(String caract, Unidade unidade, float min, float max) {
            this.caracteristica = caract;
            this.unidade = unidade;
            this.min = min;
            this.max = max;
        }
        
        

        public String getCaracteristica() {
            return caracteristica;
        }

        public void setCaracteristica(String caracteristica) {
            this.caracteristica = caracteristica;
        }

        public Unidade getUnidade() {
            return unidade;
        }

        public void setUnidade(Unidade unidade) {
            this.unidade = unidade;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }
       

        
    }
}
