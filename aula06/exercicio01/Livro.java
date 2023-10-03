package aula06.exercicio01;

public class Livro {
    private String titulo;
    private String categoria;

    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public Livro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
