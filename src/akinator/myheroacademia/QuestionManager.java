package akinator.myheroacademia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionManager {

    private final List<String> questions; // Lista principal de perguntas
    private int currentQuestionIndex;
    private final Map<String, Boolean> filters; 

    public QuestionManager() {
        Students_Questions studentQuestions = new Students_Questions();
        this.questions = studentQuestions.questionsA;
        this.filters = new HashMap<>();
        this.currentQuestionIndex = 0;
    }
    
    // Retorna a próxima pergunta filtrada
    public String getNextFilteredQuestion() {
        List<String> filteredQuestions = getFilteredQuestions();
        if (currentQuestionIndex < filteredQuestions.size()) {
            return filteredQuestions.get(currentQuestionIndex);
        } else {
            return null; // Indica que não há mais perguntas filtradas
        }
    }

    // Filtra as perguntas com base nos filtros aplicados
    private List<String> getFilteredQuestions() {
        return questions.stream()
            .filter(this::isQuestionMatchFilters)
            .collect(Collectors.toList());
    }

    // Verifica se uma pergunta corresponde aos filtros aplicados
    private boolean isQuestionMatchFilters(String question) {
        // Exemplo básico: sempre retorna true (ou ajuste conforme a lógica específica)
        // Aqui você pode checar se a pergunta atende a alguns critérios definidos pelos filtros
        return filters.isEmpty() || filters.containsKey(question);
    }
    
    // Recebe a resposta do usuário e atualiza os filtros
    public void answerCurrentQuestion(boolean answer) {
        if (currentQuestionIndex < questions.size()) {
            String currentQuestion = questions.get(currentQuestionIndex);
            filters.put(currentQuestion.trim(), answer);
            nextQuestion();
        }
    }

    // Move para a próxima pergunta
    public void nextQuestion() {
        currentQuestionIndex++;
    }
    
    // Retorna a próxima pergunta
    public String getNextQuestion() {
        if (currentQuestionIndex < questions.size()) {
            return questions.get(currentQuestionIndex);
        } else {
            return null; // Indica que não há mais perguntas
        }
    }

    // Atualiza os filtros com base na resposta
    public void updateFilters(String question, boolean answer) {
        filters.put(question, answer);
    }

    // Retorna os filtros atuais
    public Map<String, Boolean> getFilters() {
        return filters;
    }
    
    // Reinicia o índice de perguntas e os filtros
    public void reset() {
        currentQuestionIndex = 0;
        filters.clear();
    }
}
