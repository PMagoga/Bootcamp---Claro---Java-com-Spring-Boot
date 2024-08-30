package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add((t));
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listarefa = new ListaTarefa();
        // verificar se a lista está vazia
        System.out.println("O número total de elementos na lista é: " + listarefa.obterNumeroTotalTarefas());

        // adicionando uma tarefa
        listarefa.adicionarTarefa("Tarefa 1");
        // verificando o tamanho da lista
        System.out.println("O número total de elementos na lista é: " + listarefa.obterNumeroTotalTarefas());
    }
}
