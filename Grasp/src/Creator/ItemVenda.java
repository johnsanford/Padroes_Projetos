/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creator;

/**
 * Padrão de projeto <b>GRASP - Creator</b>
 *
 * @author fabricio
 */
public class ItemVenda {

    private Integer quantidade;
    private Produto produto;

    /**
     * Este método calcula o valor de cada item vendido.
     *
     * Desta forma, estamos seguindo o padrão de projeto <b>Information
     * Expert</b>
     *
     * @return
     */
    public Double getSubTotal() {
        return produto.getValor() * quantidade;
    }

    public ItemVenda() {
    }

    public ItemVenda(Integer quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
