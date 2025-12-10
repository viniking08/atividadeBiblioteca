//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList; // arraylist

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivros = new ArrayList<>();

        // arraylist / relacionamento
        Biblioteca biblioteca = new Biblioteca(listaLivros);

        // livros com atributos
        Livro l1 = new Livro("Naruto", "Kishimoto", 2000, 1, 3);
        Livro l2 = new Livro("Percy Jackson", "Rick Riordan", 2005, 2, 2);

        // herança (puxaram atributos da super classe)
        Leitor leitor = new Leitor("João", 101);
        Funcionario funcionario = new Funcionario("Maria", 999);

        // sobrescrita
        System.out.println("-- sobrescrita --");
        leitor.tipoUsuario();
        funcionario.tipoUsuario();

        // cadastro
        System.out.println("\n- cadastro -");
        funcionario.cadastrarLivros(l1, biblioteca);
        funcionario.cadastrarLivros(l2, biblioteca);

        // lista
        System.out.println("\n-- lista --");
        biblioteca.info();

        // emprestimo
        System.out.println("\n-- emprestimo --");
        biblioteca.registrarEmprestimo(l1, leitor);
        leitor.solicitarLivros(l1.getTitulo());

        // devolucao
        System.out.println("\n-- devolucao --");
        biblioteca.registrarDevolucao(l1, leitor);

        // sobrecarga
        System.out.println("\n-- sobrecarga --");
        leitor.setLivrosSolicitados(3);
        biblioteca.info(leitor);

        // remoção
        System.out.println("\n-- remoção --");
        biblioteca.removerLivros(l2);

        // lista final
        System.out.println("\n-- lista final --");
        biblioteca.info();
    }
}
