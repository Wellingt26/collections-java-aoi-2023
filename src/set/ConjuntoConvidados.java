package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidadoSet(String nome, int codigo){
    convidadoSet.add(new Convidado(nome, codigo));
  }

  public void removerConvidadoPorCodigo(int codigoConvidado){
    Convidado convidadoRemover = null;

    for (Convidado c : convidadoSet){
      if(c.getCodigoConvite() == codigoConvidado){
        convidadoRemover = c;
        break;
      }
      
    }
    convidadoSet.remove(convidadoRemover);
  }

  public int contarConvidados(){
    return convidadoSet.size();
  }

  public void exibirConvidados(){
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {

    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados \n");

    conjuntoConvidados.adicionarConvidadoSet("Wellington", 1234);
    conjuntoConvidados.adicionarConvidadoSet("Felipe", 1235);
    conjuntoConvidados.adicionarConvidadoSet("Jussara", 1236);
    conjuntoConvidados.adicionarConvidadoSet("Fernando", 1237);
    conjuntoConvidados.adicionarConvidadoSet("Renata", 1238);
    conjuntoConvidados.adicionarConvidadoSet("Gabriela", 1238);

    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set de convidados \n");

    conjuntoConvidados.exibirConvidados();

    conjuntoConvidados.removerConvidadoPorCodigo(1237);

     conjuntoConvidados.exibirConvidados();
  }
  
  
}
