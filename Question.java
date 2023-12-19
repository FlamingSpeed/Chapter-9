public class Question {
    private String answer;
    private String questionText;
    protected int questionNumber;
    public Question(String answer, String questionText){
        this.answer=answer;
        this.questionText = questionText;
    }
    public void setAnswer(String answer){
        this.answer=answer;
    }
    public void setQuestionText(String questionText){
        this.questionText=questionText;
    }
    public void setQuestionNumber(int number){
        this.questionNumber=number;
    }
    public boolean checkAnswer(String response){return response.equalsIgnoreCase(answer);}

    public String getQuestion(){return questionText;}
}

