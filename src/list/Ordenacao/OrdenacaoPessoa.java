package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa{
  private List<Pessoa> pessoasList;

  public OrdenacaoPessoa() {
    this.pessoasList = new ArrayList<>();
  }

  public void adicionarPessoa (String nome, int idade, double altura){
    pessoasList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa>ordenadoPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordernarPorAltura(){
    List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoasList);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

    return pessoaPorAltura;
  }

  public static void main(String[] args) {
    
    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

    ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
    ordenacaoPessoa.adicionarPessoa("Nome 4", 40, 1.80);
    ordenacaoPessoa.adicionarPessoa("Nome 2", 25, 1.75);
    ordenacaoPessoa.adicionarPessoa("Nome 5", 15, 1.69);
    ordenacaoPessoa.adicionarPessoa("Nome 3", 70, 1.90);

    System.out.println(ordenacaoPessoa.ordenadoPorIdade());
    System.out.println(ordenacaoPessoa.ordernarPorAltura());
  }

}
