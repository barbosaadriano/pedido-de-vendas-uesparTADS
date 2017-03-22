package br.com.adrianob.pdv.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class PedidoDeVenda {

    public PedidoDeVenda() {
        this.produtos = new ArrayList<ItemPedido>();
    }

    private Cliente cliente;

    public static final String PROP_CLIENTE = "cliente";

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente oldCliente = this.cliente;
        this.cliente = cliente;
        propertyChangeSupport.firePropertyChange(PROP_CLIENTE, oldCliente, cliente);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private List<ItemPedido> produtos;

    public static final String PROP_PRODUTOS = "produtos";

    public List getProdutos() {
        return produtos;
    }

    public void setProdutos(List produtos) {
        List oldProdutos = this.produtos;
        this.produtos = produtos;
        propertyChangeSupport.firePropertyChange(PROP_PRODUTOS, oldProdutos, produtos);
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

}
