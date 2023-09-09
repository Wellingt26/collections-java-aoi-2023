package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  //atributos
  private List<Tarefa> tarefaList;

  public ListaTarefa(){
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }

  public void removeTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();

    for (Tarefa t: tarefaList){
      if (t.getDescricao().equals(descricao)){
        tarefasParaRemover.add(t);;
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas(){
    return tarefaList.size();
  }

  public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();

    listaTarefa.adicionarTarefa("tarefa 1");
    listaTarefa.adicionarTarefa("tarefa 2");
    listaTarefa.adicionarTarefa("tarefa 3");
    listaTarefa.adicionarTarefa("tarefa 2");

    listaTarefa.removeTarefa("tarefa 3");

    System.out.println("Quantidade de itens na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}
