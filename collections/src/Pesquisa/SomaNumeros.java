package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributos
    private List<Integer> numbers;

    //Construtor
    public SomaNumeros() {
        this.numbers = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        //Adiciona um número à lista de números.
        this.numbers.add(numero);
    }

    public int calcularSoma() {
        //Calcula a soma de todos os números na lista e retorna o resultado.
        int soma = 0;
        for (Integer numero : numbers){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        //Encontra o maior número na lista e retorna o valor.
        int maiorNumero = Integer.MIN_VALUE;
        if (!numbers.isEmpty()){
            for (Integer numero : numbers){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        //Encontra o menor número na lista e retorna o valor.
        Integer menorNumero = Integer.MAX_VALUE;
        if (!numbers.isEmpty()){
            for (Integer numero : numbers){
                if (numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numbers.isEmpty()){
            System.out.println(this.numbers);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Exibindo números adiconados");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números é: "+ somaNumeros.calcularSoma());
        System.out.println("O maior dos números é : "+ somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor dos números é: "+ somaNumeros.encontrarMenorNumero());
    }
}




























