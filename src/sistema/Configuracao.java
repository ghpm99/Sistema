/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Qualidade
 */
public class Configuracao {

    private Properties pro = new Properties();

    private File file = new File("C:\\Emisor\\config.data");

    private File cadastro = null;

    private File certificado = null;

    private File fornecedores = null;

    private File backup = null;

    private int numero = 0;

    

    public Configuracao() {
        
    }

    public void carregar() throws IOException {

        pro.load(new FileInputStream(file));

        numero = Integer.valueOf(pro.getProperty("numero"));

        cadastro = new File(pro.getProperty("cadastro"));

        certificado = new File(pro.getProperty("certificado"));

        fornecedores = new File(pro.getProperty("fornecedores"));

        backup = new File(pro.getProperty("backup"));

    }

    public void salvar() throws IOException {
        pro.setProperty("numero", String.valueOf(numero));
        pro.setProperty("cadastro", cadastro.getAbsolutePath());
        pro.setProperty("certificado", certificado.getAbsolutePath());
        pro.setProperty("fornecedores", fornecedores.getAbsolutePath());
        pro.setProperty("backup", backup.getAbsolutePath());
        pro.store(new FileOutputStream(file), "Configuracoes");
    }

}
