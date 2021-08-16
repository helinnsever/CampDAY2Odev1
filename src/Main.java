
public class Main {

	public static void main(String[] args) {
		
		Course course1=new Course("Yazilim Gelistirici yetistirme kampi (JAVA+REACT)", "Engin Demirog", "Yazilim");
		
		Course course2=new Course("Yazilim Gelistirici yetistirme kampi (C#+ANGULAR)", "Engin Demirog", "Yazilim");
		
		Course course3=new Course("Programlamaya Giris icin Temel Kurs", "Engin Demirog", "Yazilim");
		
		Course[] courses= {course1, course2, course3};
		
		for(Course courseitem: courses) {
			
			System.out.println(courseitem.getCourseName()+" "+courseitem.getCourseInstructor()+" "+courseitem.getCourseCategory());
		}
		
		JobServices jobServices=new JobServices();
		
		jobServices.save(course3);
		jobServices.remove(course3);
		
		for(Course courseitem: jobServices.getCourses()) {
			System.out.println(courseitem.getCourseName()+" "+courseitem.getCourseInstructor()+" "+courseitem.getCourseCategory());
		}
		
		FAQ fAQ1= new FAQ("Yazılım Geliştirici Yetiştirme Kampı ücretsiz mi olacak?","Evet, ücretsiz olacak.");
		
		FAQ fAQ2= new FAQ("Yazılım Geliştirici Yetiştirme Kamp programı ne kadar sürecek? ","Ücretsiz olarak vereceğim bu kamp 2 ay boyunca sürecek.");
		
		FAQ[] faqs= {fAQ1, fAQ2};
		
          for(FAQ faqitem: faqs) {
			
			System.out.println(faqitem.getQuestionName()+" "+faqitem.getQuestionAnswer());
		}
          
    JobServicesFAQ jobServicesFAQ= new JobServicesFAQ();
    
    jobServicesFAQ.save(fAQ2);
    jobServicesFAQ.remove(fAQ2);
          
          
	}
}
