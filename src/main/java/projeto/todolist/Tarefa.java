package projeto.todolist;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void exibirDetalhes(){
        System.out.println("Tarefa: " + this.descricao);
        System.out.println("Concluida: " + (this.concluida ? "Sim" : "Nao"));
    }
    
    
    
    
    
}
