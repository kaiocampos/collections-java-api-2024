package main.java.list.Ordenacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    //Atributos
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        // Adiciona um número à lista.
        this.listaNumeros.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        //Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente(){
        //Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }else{
            throw new RuntimeException("A lista esá vazia!");
        }
    }

    public void exibirNumeros(){
        if (!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
