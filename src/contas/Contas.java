/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Qualidade
 */
public class Contas implements Serializable {

    private ArrayList<Conta> contas;

    private static Contas instancia;
    transient private Conta corrente;
    private Date atual, futuro;

    public static Contas getInstancia() {
        if (instancia == null) {
            instancia = new Contas();
        }
        return instancia;
    }

    public Contas() {
        this.contas = new ArrayList<>();
        addConta(new Conta("Convidado", "Convidado", new char[]{'1', '2', '3', '4', '5'}, 1, new int[]{0, 0, 0, 0, 0, 0, 0}));
        addConta(new Conta("Guilherme H.", "Guilherme", new String("").toCharArray(), 10, new int[]{1, 1, 1, 1, 1, 1, 1}));

    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public boolean logar(String login, char[] senha) {

        Iterator cont = contas.iterator();
        while (cont.hasNext()) {

            Conta con = (Conta) cont.next();
            if (con.validar(login, senha)) {
                corrente = con;
                if(!atual.after(futuro))
                return true;
                else
                    return false;
            }

        }
        return false;
    }

    public void salvar() {

        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream("contas.ser");

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
                Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void carregar() {
        FileInputStream fi = null;
        ObjectInputStream oi = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            futuro = sdf.parse("01/01/2015");
            atual = new Date();
            System.out.println(atual);
            System.out.println(futuro);
            System.out.println(atual.after(futuro));
            fi = new FileInputStream("contas.ser");

            oi = new ObjectInputStream(fi);
            instancia = (Contas) oi.readObject();

            System.out.println("Desserializado com sucesso");
        } catch (IOException e) {
            salvar();
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            salvar();
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oi != null) {
                    oi.close();
                }

                if (fi != null) {
                    fi.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getNome() {
        return corrente.getNome();
    }

    public int getNivel() {
        return corrente.getNivel();
    }

}
