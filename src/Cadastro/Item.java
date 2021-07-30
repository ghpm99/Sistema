/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

//import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import sistema.Entrada;
import sistema.Saida;

/**
 *
 * @author Qualidade
 */
public class Item implements Serializable {

    //variaveis
    private String codigo, descricao, tratamento, unidadeCome, observacao;

    private boolean isMM;
    private File certificadoOrig;

    private Dimensional dimensional;
    private ArrayList<Historico> historico = new ArrayList<>();
    private Date diaCadastro, diaAtualizar;
    private Aco material;

    //construtor
    private Item() {

    }

    //metodos
    public void salvar() {

        try {
            if (!new File("C:\\Emisor\\CADASTRO\\" + getCodigo() + ".arquivo").exists()) {
                this.diaCadastro = new Date();
            }
            this.diaAtualizar = new Date();

            Saida.salvar(new File("C:\\Emisor\\CADASTRO\\" + getCodigo() + ".arquivo"), this);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Item carregar(String codigo) {
        Item item = null;
        try {
            item = (Item) Entrada.carregar(new File("C:\\Emisor\\CADASTRO\\" + codigo + ".arquivo"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (item != null) {
            return item;
        } else {
            return vazio();
        }
    }

    private static Item vazio() {
        Item vazio = new Item();
        vazio.setDescricao("");
        vazio.setCodigo("");
        vazio.setDiaAtualizar(new Date());
        vazio.setDiaCadastro(new Date());
        vazio.setDimensional(new Dimensional());
        vazio.setIsMM(false);
        vazio.setTratamento("Polido/Oxidado");
        vazio.setUnidadeCome("");
        vazio.setMaterial(Material.getInstancia().vazio());
        vazio.setCertificadoOrig(null);

        return vazio;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDiaAtualizar() {
        return diaAtualizar;
    }

    public void setDiaAtualizar(Date diaAtualizar) {
        this.diaAtualizar = diaAtualizar;
    }

    public Date getDiaCadastro() {
        return diaCadastro;
    }

    public void setDiaCadastro(Date diaCadastro) {
        this.diaCadastro = diaCadastro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isIsMM() {
        return isMM;
    }

    public void setIsMM(boolean isMM) {
        this.isMM = isMM;
    }

    public Fisica getFisica() {
        return material.getFisica();
    }

    public Quimica getQuimica() {
        return material.getQuimica();
    }

    public Dimensional getDimensional() {
        return dimensional;
    }

    public void setDimensional(Dimensional dimensional) {
        this.dimensional = dimensional;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    public File getCertificadoOrig() {
        return certificadoOrig;
    }

    public void setCertificadoOrig(File certificadoOrig) {
        this.certificadoOrig = certificadoOrig;
    }

    public String getUnidadeCome() {
        return unidadeCome;
    }

    public void setUnidadeCome(String unidadeCome) {
        this.unidadeCome = unidadeCome;
    }

    public ArrayList<Historico> getHistorico() {
        return historico;
    }

    public void addHistorico(Historico historico) {
        this.historico.add(historico);
    }

    public Aco getMaterial() {
        return material;
    }

    public void setMaterial(Aco material) {
        this.material = material;
    }

}
