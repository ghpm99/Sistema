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
public class Unidades {

    private ArrayList<Unidade> unidade = new ArrayList<>();
    
    

    public class Unidade {

        public Unidade(String unidade) {
            this.unidade = unidade;
        }

        private String unidade;

        public String getUnidade() {
            return unidade;
        }
    }

}
