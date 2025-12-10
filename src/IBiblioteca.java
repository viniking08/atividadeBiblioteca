public interface IBiblioteca {    // encapsulamento
    public void adicionarLivros();
    public void removerLivros();
    public void info();
    public void registrarEmprestimo(Livro livro, Leitor leitor);  // simbólico
    public void registrarDevolucao(Livro livro, Leitor leitor); // simbólico
}
