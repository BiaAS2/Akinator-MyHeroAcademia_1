
package akinator.myheroacademia;

import java.util.ArrayList;
import java.util.List;

/* @author Beatriz Alves*/

public class Students_Questions {
    List<String> questionsA = new ArrayList<String>(); // Lista de perguntas dos heróis / alunos
    private int indexQuestionStudents;

    public Students_Questions() {
        loadStudentsQuestions();
        this.indexQuestionStudents = 0;
    }
    
    // Perguntas específicas dos heróis / alunos 
    public void loadStudentsQuestions(){
        questionsA.add(" Este personagem é uma mulher? ");
        questionsA.add("Este personagem pertence à Classe 1-A? ");
        questionsA.add("Este personagem tem características não-humanas ou é parcialmente animal? ");
        questionsA.add("Este personagem tem mais de uma individualidade (como 2 ou mais poderes)? ");
        questionsA.add("Este personagem tem uma personalidade extrovertida? ");
        questionsA.add("Este personagem possui alguma marca, cicatriz ou tatuagem?");
        questionsA.add(" Este personagem utiliza algum acessório na cabeça (como chapéu, capacete, etc.)? ");
        questionsA.add(" Este personagem utiliza algum acessório no rosto (como máscara, óculos, etc.)? ");
        questionsA.add("Este personagem tem uma individualidade que envolve a manipulação de eletricidade ou magnetismo? ");
        questionsA.add("Este personagem pode endurecer partes do corpo como forma de defesa? ");
        questionsA.add("Este personagem é capaz de flutuar ou manipular a gravidade? ");
        questionsA.add("Este personagem possui uma individualidade que permite crescer partes adicionais do corpo (como múltiplos braços ou olhos)? ");
        questionsA.add("Este personagem tem uma habilidade que permite se camuflar ou se tornar invisível? ");
        questionsA.add("Este personagem usa tecnologia para amplificar a sua individualidade, como áudio ou equipamentos especiais? ");
        questionsA.add("Este personagem tem uma individualidade que envolve o uso de um material orgânico ou de construção, como fitas ou lodo? ");
        questionsA.add("Este personagem tem habilidades em combate corpo a corpo? ");
        questionsA.add("Este personagem é conhecido por uma individualidade que envolve criação ou manipulação de líquidos ou sólidos? ");
        questionsA.add("Este personagem usa óculos como parte de seu traje ou estilo pessoal? ");
        questionsA.add("Este personagem é conhecido por sua velocidade ou por ser líder da Classe 1-A? ");
        questionsA.add("Este personagem é extremamente confiante, frequentemente arrogante, mas é conhecido por suas habilidades explosivas? ");
        questionsA.add("Este personagem tem uma individualidade que envolve criar ou manipular gelo ou fogo? ");
        questionsA.add("Este personagem é conhecido por ser extremamente amigável e otimista, mesmo em situações difíceis? ");
    }
}
