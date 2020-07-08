package studio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Checkbox extends Question{

    public Checkbox() {
    }

    @Override
    public List<String> getQuestions() {
        return questions;
    }

    @Override
    public void createQuestion(String questions) {
        String[] arrOfStr = questions.split(",");
        List<String> questionList = new ArrayList<>();
        questionList = Arrays.asList(arrOfStr);
        for (String listItem : questionList){
            this.questions.add(questions);
        }
    }

    @Override
    public List<String> getAnswers() {
        return answers;
    }

    @Override
    public void setAnswer(String answer) {
        String[] arrOfStr = answer.split(",");
        List<String> answerList = new ArrayList<>();
        answerList = Arrays.asList(arrOfStr);
        for (String listItem : answerList){
            this.answers.add(answer);
        }
    }
}