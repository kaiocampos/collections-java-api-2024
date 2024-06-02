package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributo
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        //Adiciona uma palavra ao conjunto.
        this.palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        //Remove uma palavra do conjunto.
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
                System.out.println("A palavra " + palavra + " foi removida");
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        //Verifica se uma palavra está presente no conjunto.
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        //Exibe todas as palavras únicas do conjunto.
        if (!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        // Adicionando linguagens únicas ao conjunto
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoPalavrasUnicas.removerPalavra("Python");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoPalavrasUnicas.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
