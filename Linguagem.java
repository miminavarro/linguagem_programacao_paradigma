
abstract class Linguagem {
    private String nome;
    private String nivelAbstracao;
    private String paradigma;

    public Linguagem(String nome, String nivelAbstracao, String paradigma) {
        this.nome = nome;
        this.nivelAbstracao = nivelAbstracao;
        this.paradigma = paradigma;
    }

    public String getNome() {
        return nome;
    }

    public String getNivelAbstracao() {
        return nivelAbstracao;
    }

    public String getParadigma() {
        return paradigma;
    }

    public abstract String getCategoria(); 

    @Override
    public String toString() {
        return "Linguagem: (" +
                "Nome: '" + nome + '\'' +
                ", Nível de Abstracao: '" + nivelAbstracao + '\'' +
                ", Paradigma: '" + paradigma + '\'' +
                ", Categoria: '" + getCategoria() + '\'' +
                ')';
    }
}