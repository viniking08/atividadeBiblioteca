public class Funcionario extends Usuario {   // requisito ténico 2


    public Funcionario(String nome, int id) {
        super(nome, id);
    }

    public void cadastrarLivros(Livro livro, Biblioteca biblioteca) {
        System.out.println("O livro " + livro.getTitulo() + " cadastrado com sucesso");
        biblioteca.adicionarLivro(livro);   // relacionamento entre classes (dependencia)
    }

    @Override
    public void tipoUsuario() {
        System.out.println("O usuário é um funcionário (pode cadastrar livros)");
    }

    public void solicitarLivros(String livro) {
        System.out.println("Livro " + livro + " solicitado");
    }
}
