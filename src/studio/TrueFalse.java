package studio;

import java.util.List;

public class TrueFalse extends Question{

    public TrueFalse() {
    }

    @Override
    public List<String> getQuestions() {
        return questions;
    }

    @Override
    public void createQuestion(String questions) {
        this.questions.add(questions);
    }

    @Override
    public List<String> getAnswers() {
        return answers;
    }

    @Override
    public void setAnswer(String answer) {
        this.answers.add(answer);
    }
}