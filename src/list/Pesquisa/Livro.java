package list.Pesquisa;

public class Livro {
  private String titulo;
  private String Autor;
  private int anoPublicacao;

  public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    Autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  public String getAutor() {
    return Autor;
  }

  public String getTitulo() {
    return titulo;
  }

  @Override
  public String toString() {
    return titulo + ", " +  Autor + ", " + anoPublicacao;
  }
}
