package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos(){
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato (String nome, Integer telefone){
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome){
    if (!agendaContatoMap.isEmpty()){
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContato(){
      System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome (String nome){
    Integer numeroPorNome = null;

    if (!agendaContatoMap.isEmpty()){
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }
  
  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Wellington", 123456);
    agendaContatos.adicionarContato("João", 654321);
    agendaContatos.adicionarContato("Fernando", 234561);
    agendaContatos.adicionarContato("Paula", 546132);

    agendaContatos.exibirContato();
    agendaContatos.removerContato("Wellington");
    agendaContatos.exibirContato();
    System.out.println("O numero é " + agendaContatos.pesquisarPorNome("Fernando"));


  }
}
