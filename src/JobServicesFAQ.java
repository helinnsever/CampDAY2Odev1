
public class JobServicesFAQ {

	public void save(FAQ faq) {
		System.out.println(faq.getQuestionName()+" sorusu sisteme basarili bir sekilde eklendi");
	}
	
	public void remove(FAQ faq) {
		System.out.println(faq.getQuestionName()+" sorusu sistemden basarili bir sekilde kaldirildi");
	}
}
