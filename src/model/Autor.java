package model;

import java.time.LocalDate;
import java.util.UUID;

public class Autor {
    private static long contadorId = 1;
    private Long id;
    public String nome;
    public LocalDate dataNascimento;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Autor(String nome, LocalDate dataNascimento) {
        this.id = contadorId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
