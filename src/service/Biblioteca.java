package service;

import model.Autor;
import model.Emprestimo;
import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Emprestimo> emprestimos;


    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarAutor(Autor autor) {
        autores.add(autor);
    }

    public void realizarEmprestimo(long idLivro, Livro livro, String usuario) {
        if(idLivro == livro.getId() && livro.isDisponivel()) {
            livro.setDisponivel(false);
            Emprestimo novoEmprestimo = new Emprestimo(livro, usuario);
            emprestimos.add(novoEmprestimo);
            System.out.println("Empréstimo realizado para " + usuario + " do livro: " + livro.getTitulo());
        } else {
            System.out.println("Desculpa, o livro '" + livro.getTitulo() + "' não está disponível no momento.");
        }
    }

    public void listarLivrosDisponiveis() {
        System.out.println("\n--- Livros Disponíveis na Biblioteca ---");
        for (Livro livro: livros) {
            if (livro.isDisponivel()) {
                System.out.println("ID: " + livro.getId() + " - Nome do livro: " + livro.getTitulo() + " - Autor: " + livro.getAutor().getNome());
            }
        }
    }
}
