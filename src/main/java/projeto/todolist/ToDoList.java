package projeto.todolist;

public class ToDoList {

    public static void main(String[] args) {

        GerenciadorDeTarefas g = new GerenciadorDeTarefas();

        System.out.println("--- Adicionando Tarefas ---");
        g.adicionarTarefa("comer");
        g.adicionarTarefa("beber");
        g.adicionarTarefa("dancar");
        g.adicionarTarefa("estudar Java"); 
        System.out.println("\n--- Lista Inicial de Tarefas ---");
        g.listarTodasTarefas();

        System.out.println("\n--- Marcando Tarefas como Concluídas ---");
        g.marcarTarefaConcluida("comer"); 
        g.marcarTarefaConcluida("dancar"); 
        g.marcarTarefaConcluida("dancar"); 
        g.marcarTarefaConcluida("rir"); // Não existe
        System.out.println("\n--- Lista de Tarefas após Conclusão ---");
        g.listarTodasTarefas();

        //TESTES DE REMOÇÃO:
        System.out.println("\n--- Removendo Tarefas ---");
         g.removerTarefa("comer");
         g.removerTarefa("dancar");

        //LISTAGEM FINAL:
        System.out.println("\n--- Lista Final de Tarefas após Remoção ---");
         g.listarTodasTarefas();
    }
}