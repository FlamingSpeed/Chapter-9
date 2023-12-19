import java.util.Scanner;

public class TestApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Question question=new Question("What is the weather right now?","Foggy");

        askQuestionAndCheckAnswer(question, in);

        ChoiceQuestion choiceQuestion = new ChoiceQuestion("How many days are in january","31");
        choiceQuestion.setQuestionText("How many days are in January?");
        choiceQuestion.addChoice("28",false);
        choiceQuestion.addChoice("30",false);
        choiceQuestion.addChoice("31",true);
        choiceQuestion.questionNumber =1;
        askQuestionAndCheckAnswer(choiceQuestion,in);

    }



    private static void askQuestionAndCheckAnswer(Question question, Scanner in){
        boolean correct;
        System.out.println(question.getQuestion());
        String choiceResponse = in.nextLine();
        correct = question.checkAnswer(choiceResponse);
        if (correct) {
            System.out.println("You are correct!");
        }else{
            System.out.println("Incorrect");
        }
    }
}
