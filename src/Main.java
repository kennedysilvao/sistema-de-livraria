import model.Autor;
import model.Livro;
import service.Biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca();

        Autor autor1 = new Autor("Igor Calango", LocalDate.of(2002, 9, 29));
        minhaBiblioteca.cadastrarAutor(autor1);

        Livro livro1 = new Livro("Batman", autor1);
        minhaBiblioteca.cadastrarLivro(livro1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você deseja ver os livros disponíveis na biblioteca? S/N");
        String respostaUsuario = scanner.nextLine();

        if(respostaUsuario.equalsIgnoreCase("S")) {
            System.out.println("Copie o id do livro que você deseja");
            minhaBiblioteca.listarLivrosDisponiveis();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Cole o id do livro escolhido:");
            int idLivro = scanner1.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Para finalizarmos, preciso que você me diga qual o seu nome:");
            String nomeCliente = scanner2.nextLine();
            minhaBiblioteca.realizarEmprestimo(idLivro, livro1, nomeCliente);
        } else {
            System.out.println("Obrigado, volte sempre!");
        }

    }
}