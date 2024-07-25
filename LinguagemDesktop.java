// Subclasse para Linguagens de Desktop
class LinguagemDesktop extends Linguagem {
    public LinguagemDesktop(String nome, String nivelAbstracao, String paradigma) {
        super(nome, nivelAbstracao, paradigma);
    }

    @Override
    public String getCategoria() {
        return "Desktop";
    }
}