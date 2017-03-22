package br.com.adrianob.pdv.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Administrador
 */
public class Cliente {

    private String CPF;

    public static final String PROP_CPF = "CPF";

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        String oldCPF = this.CPF;
        this.CPF = CPF;
        propertyChangeSupport.firePropertyChange(PROP_CPF, oldCPF, CPF);
    }

    private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private String situacao;

    public static final String PROP_SITUACAO = "situacao";

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        String oldSituacao = this.situacao;
        this.situacao = situacao;
        propertyChangeSupport.firePropertyChange(PROP_SITUACAO, oldSituacao, situacao);
    }

    private Integer codigo;

    public static final String PROP_CODIGO = "codigo";

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        Integer oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
