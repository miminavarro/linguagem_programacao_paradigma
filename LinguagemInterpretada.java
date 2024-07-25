// Subclasse para Linguagens Interpretadas
class LinguagemInterpretada extends Linguagem {
    public LinguagemInterpretada(String nome, String nivelAbstracao, String paradigma) {
        super(nome, nivelAbstracao, paradigma);
    }

    @Override
    public String getCategoria() {
        return "Interpretada";
    }
}