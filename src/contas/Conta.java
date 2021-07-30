/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import java.io.Serializable;

/**
 *
 * @author Qualidade
 */
public class Conta implements Serializable{

    protected Conta(String nome, String login, char[] senha,int nivel, int[] acesso) {
        
        setNome(nome);
        setLogin(login);
        setSenha(senha);
        setNivel(nivel);
        setAcesso(acesso);
        
    }

    private final int MENU = 7;
    private String nome, login;
    private int nivel;
    private char[] senha;
    private int[] acesso = new int[MENU];

    protected void setNome(String nome) {
        if (nome.isEmpty()) {
            return;
        }
        if (nome.length() >= 4 && nome.length() <= 20) {
            this.nome = nome;
        }
    }

    protected void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 10) {
            this.nivel = nivel;
        }
    }

    protected void setAcesso(int[] acesso) {
        if (acesso.length == MENU) {
            this.acesso = acesso;
        }
    }

    protected void setLogin(String login) {
        if (login.isEmpty()) {
            return;
        }
        if (login.length() >= 4 && login.length() <= 10) {
            this.login = login;
        }
    }

    protected void setSenha(char[] senha) {
        if(senha.length > 0 && senha.length <= 10)
            this.senha = senha;
        else
            this.senha = new String("000000000").toCharArray();
    }

    protected String getNome() {
        return nome;
    }

    protected int getNivel() {
        return nivel;
    }

    protected int[] getAcesso() {
        return acesso;
    }

    protected boolean validar(String login, char[] senha) {
        return this.login.equals(login) && new String(senha).equals(new String(this.senha));
    }
    
    

}
