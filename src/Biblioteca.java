import java.util.ArrayList; // arraylist

public class Biblioteca {            // requisito tecnico 4

    private ArrayList<Livro> livros;

    public Biblioteca(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }
    public void removerLivros(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido: " + livro.getTitulo());
    }
    public void info() {             //deixar bem claro que eu não sabia fazer isso, tive que pesquisar (o Livro livro : livros)
        System.out.println("Livros da biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
    public void info(Leitor leitor) {    //sobrecarga
        System.out.println("Quantia de livros solicidados por " + leitor.getNome() + ": " + leitor.getLivrosSolicitados());
    }

    public void registrarEmprestimo(Livro livro, Leitor leitor) {
        System.out.println("Empréstimo do livro " + livro.getTitulo() + " para o leitor " + leitor.getNome());
    }

    public void registrarDevolucao(Livro livro, Leitor leitor) {
        System.out.println("Devolução do livro " + livro.getTitulo() + " pelo leitor " + leitor.getNome());
    }
}

