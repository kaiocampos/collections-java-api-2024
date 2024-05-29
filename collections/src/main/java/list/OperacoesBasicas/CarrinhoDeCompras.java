package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        //: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        //: Remove um item do carrinho com base no seu nome.
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                } else {
                    System.out.println("A lista está vazia");
                }
            }
        }
    }

    public double calcularValorTotal() {
        //: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.}
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        //: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" + "itens=" + itemList + '}';
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

