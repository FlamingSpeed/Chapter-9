import java.util.ArrayList;
import java.util.List;

public class ChoiceQuestion extends Question{
    private List<String> choices;
    public ChoiceQuestion(String question, String answer){
        super(question,answer);
        choices=new ArrayList<>();
    }
    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct){
            setAnswer(choice);
        }
    }
    public void setQuestionNumber(int questionNumber){
        this.questionNumber = questionNumber;
    }
    public String getQuestion(){
        var question= super.getQuestion();
        for(var choice: choices){
            question += "\n" + choice;
        }
        return question;
    }

}
