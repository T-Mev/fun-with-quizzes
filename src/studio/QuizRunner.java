package studio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      Keep track of final score
        int userScore = 0;
        int totalScore = 0;

//      Creating quizzes
        TrueFalse trueFalseQuiz = new TrueFalse();
        MultipleChoice multipleQuiz = new MultipleChoice();
        Checkbox checkboxQuiz = new Checkbox();

//      Set true/false questions and answers
        trueFalseQuiz.createQuestion("➤ True or False:\nLaunchCode starts with the letter 'I'?");
        trueFalseQuiz.createQuestion("➤ True or False:\nLaunchCode ends with the letter 'A'?");
        trueFalseQuiz.setAnswer("True");
        trueFalseQuiz.setAnswer("False");

//      Set multiple choice questions and answers
        multipleQuiz.createQuestion("➤ How many minutes in an hour?\n" +
                "• 45\n" +
                "• 30\n" +
                "• 60\n" +
                "• 120");
        multipleQuiz.createQuestion("➤ What color is the ocean?\n" +
                "• Red\n" +
                "• Blue\n" +
                "• Yellow\n" +
                "• Purple");
        multipleQuiz.setAnswer("60");
        multipleQuiz.setAnswer("Blue");

//      Set checkbox questions and answers
        multipleQuiz.createQuestion("➤ Select all that apply:\n" +
                "What is found on a face?\n" +
                "(Enter each answer separated by a comma (Ex. answer1,answer2,answer3)\n" +
                "• Eyes\n" +
                "• Fin\n" +
                "• Mouth\n" +
                "• Fingers");
        multipleQuiz.createQuestion("➤ Select all that apply:\n" +
                "Which of these are in the Simpson family?\n" +
                "(Enter each answer separated by a comma (Ex. answer1,answer2,answer3)\n" +
                "• Milhouse\n" +
                "• Bart\n" +
                "• Homer\n" +
                "• Lisa");
        multipleQuiz.setAnswer("Eyes,Mouth");
        multipleQuiz.setAnswer("Bart,Homer,Lisa");

//      Ask true/false questions and check if correct
        int trueFalseScore = 0;
        for (int i = 0; i < trueFalseQuiz.getQuestions().size(); i++){
            System.out.println(trueFalseQuiz.getQuestions().get(i));
            String userAnswer = input.next();

            if (userAnswer.toLowerCase().equals(trueFalseQuiz.getAnswers().get(i).toLowerCase())){
                System.out.println("Correct!\n");
                trueFalseScore++;
            } else {
                System.out.println("Sorry, that is incorrect.\n");
            }
        }

//      Ask multiple choice questions and check if correct
        int multipleChoiceScore = 0;
        for (int i = 0; i < multipleQuiz.getQuestions().size(); i++){
            System.out.println(multipleQuiz.getQuestions().get(i));
            String userAnswer = input.next();

            if (userAnswer.toLowerCase().equals(multipleQuiz.getAnswers().get(i).toLowerCase())){
                System.out.println("Correct!\n");
                multipleChoiceScore++;
            } else {
                System.out.println("Sorry, that is incorrect.\n");
            }
        }

//      Ask checkbox questions and check if correct
        int checkboxScore = 0;
        List<String> userInput = new ArrayList<String>();

        for (int i = 0; i < checkboxQuiz.getQuestions().size(); i++){
            System.out.println(checkboxQuiz.getQuestions().get(i));
            String userAnswer = input.next();
            userInput.add(userAnswer);

            if (userInput.equals(checkboxQuiz.getAnswers().get(i).toLowerCase())){
                System.out.println("Correct!\n");
                multipleChoiceScore++;
            } else {
                System.out.println("Sorry, that is incorrect.\n");
            }
        }

        input.close();

//      Print how many correct
        userScore = trueFalseScore + multipleChoiceScore + checkboxScore;
        totalScore = trueFalseQuiz.getQuestions().size() + multipleQuiz.getQuestions().size() + checkboxQuiz.getQuestions().size();

        System.out.println("➤ Quiz completed!");
        System.out.println("➤ You got " + userScore + " out of " + totalScore + " correct.");
    }
}