import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Linguagem> linguagens = new ArrayList<>();

        // Adicionando linguagens
        linguagens.add(new LinguagemDesktop("C", "Médio Nível", "Programação Estruturada"));
        linguagens.add(new LinguagemDesktop("C++", "Médio Nível", "Programação Orientada a Objetos"));
        linguagens.add(new LinguagemDesktop("Java", "Alto Nível", "Programação Orientada a Objetos"));
        linguagens.add(new LinguagemInterpretada("Python", "Nível", "Programação Funcional"));
        linguagens.add(new LinguagemInterpretada("Ruby", "Nível", "Programação Funcional"));
        linguagens.add(new LinguagemInterpretada("JavaScript", "Alto Nível", "Programação Funcional"));


        // Exibição das linguagens
        for (Linguagem linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}