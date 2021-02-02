/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creator;

import java.util.ArrayList;
import java.util.Date;

/**
 * Padrão de projeto <b>GRASP - Creator</b>
 *
 * Foram criados três produtos e uma venda. Foram adicionados os três produtos
 * na venda, com quantidades diferentes.
 *
 * Através do método getTotal (da classe Venda) foi possível imprimir o total da
 * venda.
 *
 * @author fabricio
 */
public class GraspCreator {

    public static void main(String[] args) {
        Produto p1 = new Produto("Macarrão", 5.50, 10);
        Produto p2 = new Produto("Arroz", 2.60, 12);
        Produto p3 = new Produto("Feijão", 3.40, 15);

        Venda venda = new Venda(new Date(), new ArrayList<>());
        venda.adicionarItem(p1, 1); //Venda de 1 pacote de macarrão
        venda.adicionarItem(p2, 3); //Venda de 3 pacote de arroz
        venda.adicionarItem(p3, 5); //Venda de 5 pacote de feijão

        //Método anterior
//        venda.getItens().add(new ItemVenda(1, p1)); //Venda de 1 pacote de macarrão
//        venda.getItens().add(new ItemVenda(3, p2)); //Venda de 3 pacotes de arroz
//        venda.getItens().add(new ItemVenda(5, p3)); //Venda de 5 pacotes de feijão
//
        System.out.println("Subtotal vendido para cada produto");
        for (ItemVenda item : venda.getItens()) {
            System.out.println(item.getSubTotal() + " vendido para o produto " + item.getProduto().getDescricao());
        }
        System.out.println();
        System.out.println("Total da venda: \n" + venda.getTotalIncorreto());
        System.out.println("Total da venda (Padrão Information Expert): \n" + venda.getTotal());

    }

}
