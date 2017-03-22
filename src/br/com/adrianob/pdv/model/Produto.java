package br.com.adrianob.pdv.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Administrador
 */
public class Produto {

     private Integer codigo;
     
    private String descricao;

    public static final String PROP_DESCRICAO = "descricao";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
    }

        private float custo;

    public static final String PROP_CUSTO = "custo";

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        float oldCusto = this.custo;
        this.custo = custo;
        propertyChangeSupport.firePropertyChange(PROP_CUSTO, oldCusto, custo);
    }

    private float preco;

    public static final String PROP_PRECO = "preco";

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        float oldPreco = this.preco;
        this.preco = preco;
        propertyChangeSupport.firePropertyChange(PROP_PRECO, oldPreco, preco);
    }


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
