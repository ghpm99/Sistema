/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;

/**
 *
 * @author Qualidade
 */
public class Entrada {

    public static Object carregar(File arg0) throws FileNotFoundException {
        FileInputStream fi = null;
        ObjectInputStream oi = null;

        PrintStream erro = new PrintStream("ERRO.txt");

        try {
            fi = new FileInputStream(arg0);

            oi = new ObjectInputStream(fi);

            System.out.println("Desserializado com sucesso");

            return oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(erro);
        } finally {
            try {
                if (oi != null) {
                    oi.close();
                }

                if (fi != null) {
                    fi.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace(erro);
            }
        }
        return null;
    }

}
