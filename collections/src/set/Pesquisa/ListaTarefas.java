package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributo
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        //   Adiciona uma nova tarefa ao Set.
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        }else {
            System.out.println("O conjunto está vazio");
        }
        if (tarefaParaRemover == null){
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        //   Exibe todas as tarefas da lista de tarefas.
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa está encontrada!");
        }
    }

    public int contarTarefas() {
        //Conta o número total de tarefas na lista de tarefas.
        return tarefaSet.size();

    }

    public Set<Tarefa> obterTarefasConcluidas() {
        //Retorna um Set com as tarefas concluídas.
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        //Retorna um Set com as tarefas pendentes.
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet){
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        //Marca uma tarefa como concluída de acordo com a descrição.
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        // Marca uma tarefa como pendente de acordo com a descrição.
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = t;
                break;
            }
        }
        if (tarefaPendente != null){
            if (tarefaPendente.isConcluida()){
                tarefaPendente.setConcluida(false);
            }
        }else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        //   Remove todas as tarefas da lista de tarefas.
        if (tarefaSet.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            tarefaSet.clear();
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
