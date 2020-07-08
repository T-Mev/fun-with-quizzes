package studio;

import java.util.ArrayList;
import java.util.List;

public abstract class Question {
    List<String> questions = new ArrayList<>();
    List<String> answers = new ArrayList<>();

    public Question() {
    }

    public abstract List<String> getQuestions();

    public abstract void createQuestion(String questions);

    public abstract List<String> getAnswers();

    public abstract void setAnswer(String answer);

}
