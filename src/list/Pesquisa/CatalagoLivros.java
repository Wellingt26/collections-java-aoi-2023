package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
  private List<Livro> livroList;

  public CatalagoLivros(){
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String livro, String autor, int anoPublicacao){
    livroList.add(new Livro(livro, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String Autor){
    List<Livro>livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()){
      for (Livro l : livroList){
        if(l.getAutor().equalsIgnoreCase(Autor)){
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervalosAno = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro l : livroList){
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
          livrosPorIntervalosAno.add(l);
        }
      }
    }
    return livrosPorIntervalosAno;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;

    if(!livroList.isEmpty()){
      for(Livro l : livroList){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      } 
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalagoLivros catalagoLivros = new CatalagoLivros();

    catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
    catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
    catalagoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
    catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
    catalagoLivros.adicionarLivro("Livro 5", "Autor 5", 1995);
    catalagoLivros.adicionarLivro("Livro 6", "Autor 6", 1996);

    System.out.println(catalagoLivros.pesquisarPorIntervalosAnos(2021, 2023));
    System.out.println(catalagoLivros.pesquisarPorTitulo("livro 3"));
    System.out.println(catalagoLivros.pesquisarPorAutor("Autor 6"));
    
  }
}
