package model;

import java.time.LocalDate;
import java.util.UUID;

public class Emprestimo {
    private static long contadorId = 1;
    private Long id;
    public Livro livro;
    public String nomeCliente;
    public LocalDate dataEmprestimo;
    public LocalDate dataDevolucao;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", livro=" + livro +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }

    public Emprestimo(Livro livro, String nomeCliente) {
        this.id = contadorId++;
        this.nomeCliente = nomeCliente;
    }
}
