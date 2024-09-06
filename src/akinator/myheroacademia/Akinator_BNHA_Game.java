
package akinator.myheroacademia;

import java.util.ArrayList;
import java.util.List;

public class Akinator_BNHA_Game {
    private final QuestionManager questionManager;
    private final List<Students_Characters> characters;
    private final List<Boolean> userAnswers;

    public Akinator_BNHA_Game() {
        questionManager = new QuestionManager();
        characters = StudentDatabase.initializeStudents();
        userAnswers = new ArrayList<>();
    }
    
    public String getCurrentQuestion() {
        return questionManager.getNextFilteredQuestion();
    }
    
    public void answerYes() {
        userAnswers.add(true);
        filterCharacters(true);
        questionManager.nextQuestion();
    }

    public void answerNo() {
        userAnswers.add(false);
        filterCharacters(false);
        questionManager.nextQuestion();
    }

    public String getFinalCharacter() {
        if (characters.size() == 1) {
            return characters.get(0).getName() + " ^-^";
        } else if (characters.isEmpty()) {
            return "Ops!! Não encontrei um personagem com essas características. T-T";
        } else {
            return "Ainda não tenho certeza. Tente Novamente.";
        }
    }

    private void filterCharacters(boolean resposta) {
        int perguntaAtual = userAnswers.size() - 1;
        StudentDatabase.filter(characters, perguntaAtual, resposta);
    }
}
