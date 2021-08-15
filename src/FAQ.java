
public class FAQ {

	private String QuestionName;
	private String QuestionAnswer;
	
	public FAQ(String QuestionName, String QuestionAnswer) {
		this.QuestionName=QuestionName;
		this.QuestionAnswer=QuestionAnswer;
	}
	public String getQuestionName() {
		return QuestionName;
	}
	public void setQuestionName(String questionName) {
		QuestionName = questionName;
	}
	public void setQuestionAnswer(String questionAnswer) {
		QuestionAnswer=questionAnswer;
	}
	public String getQuestionAnswer() {
		return QuestionAnswer;
	}
	
}
