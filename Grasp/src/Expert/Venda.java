/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expert;

import java.util.Date;
import java.util.List;

/**
 *
 * @author fabricio
 */
public class Venda {

    private Date dataVenda; //Data da venda
    private List<ItemVenda> itens; //Itens

    /**
     * Método utilizado para calcular o total da venda.
     *
     * Percorre os ítens da venda e soma utilizando o método getSubTotal da
     * classe ItemVenda. Isso é necessário pois a classe Venda não tem ligação
     * direta com o produto.
     *
     * Desta forma, estamos seguindo o padrão de projeto <b>Information
     * Expert</b>
     *
     * @return
     */
    public Double getTotal() {
        Double total = 0D;
        for (ItemVenda item : itens) {
            total += item.getSubTotal();
        }
        return total;
    }

    /**
     * Não está de acordo com o padrão de projeto <b>Information Expert</b> pois
     * cria uma dependência entre Venda e Produto
     *
     * @since 1.0
     * @return
     */
    @Deprecated
    public Double getTotalIncorreto() {
        Double total = 0D;
        for (ItemVenda item : itens) {
            total += item.getProduto().getValor() * item.getQuantidade();
        }
        return total;
    }

    public Venda() {
    }

    public Venda(Date dataVenda, List<ItemVenda> itens) {
        this.dataVenda = dataVenda;
        this.itens = itens;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

}
