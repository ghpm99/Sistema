/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qualidade
 */
public class Material implements Serializable {

    private static Material instancia;
    private ArrayList<Aco> acos = new ArrayList<>();

    public static Material getInstancia() {
        if (instancia == null) {
            instancia = new Material();
        }
        return instancia;
    }

    public void salvar() {

        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream("Material.mat");

            oo = new ObjectOutputStream(fo);
            oo.writeObject(getInstancia()); // serializo objeto cat

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
                Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void carregar() {
        FileInputStream fi = null;
        ObjectInputStream oi = null;

        try {
            fi = new FileInputStream("Material.mat");

            oi = new ObjectInputStream(fi);
            instancia = (Material) oi.readObject();

            System.out.println("Desserializado com sucesso");
        } catch (IOException | ClassNotFoundException e) {
            salvar();
            e.printStackTrace();
        } finally {
            try {
                if (oi != null) {
                    oi.close();
                }

                if (fi != null) {
                    fi.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void addMaterial(Aco arg0) {
        this.acos.add(arg0);
    }

    public Aco getMaterial(int index) {
        return acos.get(index);
    }

    public ArrayList<Aco> getArray() {
        return acos;
    }

    public void setMaterial(int index, Aco arg0) {
        acos.set(index, arg0);
    }

    public int getLeght() {
        return acos.size();
    }

    public void retirar(int index) {
        acos.remove(index);
    }

    public Aco vazio() {
        return new Aco(" ", " ", " ", new Quimica(), new Fisica());
    }
}
