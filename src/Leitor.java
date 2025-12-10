public class Leitor extends Usuario {           // requisito técnico 2

    private int livrosSolicitados;

    public Leitor(String nome, int id) {
        super(nome, id);
    }

    public int getLivrosSolicitados() {
        return livrosSolicitados;
    }

    public void setLivrosSolicitados(int livrosSolicitados) {
        this.livrosSolicitados = livrosSolicitados;
    }

    @Override         //polimorfismo / sobrescrita
    public void tipoUsuario() {
        System.out.println("O usuário é do tipo leitor");
    }

    public void solicitarLivros(String livro) {
        System.out.println("Livro " + livro + " solicitado");
    }
}
