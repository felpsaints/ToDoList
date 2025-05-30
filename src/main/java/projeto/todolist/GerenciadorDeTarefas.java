package projeto.todolist;

import java.util.ArrayList;

public class GerenciadorDeTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public GerenciadorDeTarefas() {
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        tarefas.add(novaTarefa);
    }

    public void listarTodasTarefas() {
        System.out.println("Lista de Tarefas");
        if (tarefas.isEmpty()) {
            System.out.println("Sem tarefas");
        } else {
            for (Tarefa novaTarefa : tarefas) {
                novaTarefa.exibirDetalhes();
            }
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefaEncontrada = this.buscarTarefa(descricao);
        if (tarefaEncontrada != null) {
            if (!tarefaEncontrada.isConcluida()) {
                tarefaEncontrada.setConcluida(true);
                System.out.println("Tarefa '" + descricao + "'Concluida!");
            } else {
                System.out.println("Tarefa '" + descricao + "'Ja concluida!");
            }
        } else {
            System.out.println("Tarefa nao encontrada.");
        }

    }

    public void removerTarefa(String descricao) {
        Tarefa retirarTarefa = this.buscarTarefa(descricao);
        if (retirarTarefa != null) {
            tarefas.remove(retirarTarefa);
            System.out.println("Tarefa '" + descricao + "'removida");
        } else {
            System.out.println("Tarefa nao encontrada");
        }
    }

    public Tarefa buscarTarefa(String descricao) {
        for (Tarefa novaTarefa : tarefas) {
            if (novaTarefa.getDescricao().equalsIgnoreCase(descricao)) {
                return novaTarefa;
            } else {
            }
        }
        return null;
    }
}
