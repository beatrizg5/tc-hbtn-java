import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    String titulo;
    String autor;
    double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        this.titulo = titulo;
        if(getTitulo().length() < 3){
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        this.autor = autor;
        if(getAutor().length()<=2){
            throw new AutorInvalidoException("Nome de autor invalido");
        }

    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        this.preco = preco;
        if (getPreco() < 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
    }
}
