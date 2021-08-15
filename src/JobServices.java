

public class JobServices {

	public void save(Course course) {
		
		System.out.println(course.getCourseName()+" sisteme kaydedildi");
	}
	
	public void remove(Course course) {
		System.out.println(course.getCourseName()+" sistemden kaldirildi");
	}
	
	public Course[] getCourses() {
		
      Course course1=new Course("Yazilim Gelistirici yetistirme kampi (JAVA+REACT)", "Engin Demirog", "Yazilim");
		
		Course course2=new Course("Yazilim Gelistirici yetistirme kampi (C#+ANGULAR)", "Engin Demirog", "Yazilim");
		
		Course course3=new Course("Programlamaya Giris icin Temel Kurs", "Engin Demirog", "Yazilim");
		
		Course[] courses= {course1, course2, course3};
		return courses;
	}

	
}