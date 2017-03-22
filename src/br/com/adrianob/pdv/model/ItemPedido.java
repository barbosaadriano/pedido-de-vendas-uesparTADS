package br.com.adrianob.pdv.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Administrador
 */
public class ItemPedido {

            private float valorUnitario;

    public static final String PROP_VALORUNITARIO = "valorUnitario";

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        float oldValorUnitario = this.valorUnitario;
        this.valorUnitario = valorUnitario;
        propertyChangeSupport.firePropertyChange(PROP_VALORUNITARIO, oldValorUnitario, valorUnitario);
    }

    private float descontoUnitario;

    public static final String PROP_DESCONTOUNITARIO = "descontoUnitario";

    public float getDescontoUnitario() {
        return descontoUnitario;
    }

    public void setDescontoUnitario(float descontoUnitario) {
        float oldDescontoUnitario = this.descontoUnitario;
        this.descontoUnitario = descontoUnitario;
        propertyChangeSupport.firePropertyChange(PROP_DESCONTOUNITARIO, oldDescontoUnitario, descontoUnitario);
    }

        private Produto produto;

    public static final String PROP_PRODUTO = "produto";

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        Produto oldProduto = this.produto;
        this.produto = produto;
        propertyChangeSupport.firePropertyChange(PROP_PRODUTO, oldProduto, produto);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    
}
