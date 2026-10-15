package model;

import java.time.LocalDate;
import java.util.UUID;

public class Livro {
    private static long contadorId = 1;
    private long id;
    public String titulo;
    public Autor autor;
    public boolean disponivel;
    public LocalDate dataCadastro;
    public LocalDate dataAtualizacao;

    public Long getId() {
        return id;
    }

    public Livro(String titulo, Autor autor) {
        this.id = contadorId++;
        this.titulo = titulo;
        this.autor = autor;
        this.dataCadastro = LocalDate.now();
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", disponivel=" + disponivel +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }
}
