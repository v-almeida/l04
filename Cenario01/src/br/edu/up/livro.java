package br.edu.up;

public class livro {
    private String titulo;
    private String codigo;
    private String autores;
    private String Isbn;
    private int ano;
    
    public livro(String titulo, String codigo, String autores, String isbn, int ano) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.autores = autores;
        Isbn = isbn;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    

    
}
