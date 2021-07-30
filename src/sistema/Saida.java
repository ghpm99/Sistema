/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Qualidade
 */
public class Saida {

    public static void salvar(File arg0, Object arg1) throws FileNotFoundException {
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            
            fo = new FileOutputStream(arg0);
            oo = new ObjectOutputStream(fo);
            oo.writeObject(arg1); // serializo objeto cat

            System.out.println("Object serializado com sucesso");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fo != null) {
                    fo.close();
                }
                if (oo != null) {
                    oo.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
