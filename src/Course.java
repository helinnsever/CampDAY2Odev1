
public class Course {

	
	private String CourseName;
	private String CourseInstructor;
	private String CourseCategory;
	
	public Course(String CourseName, String CourseInstructor, String CourseCategory) {
		this.CourseName= CourseName;
		this.CourseInstructor= CourseInstructor;
		this.CourseCategory=CourseCategory;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public String getCourseInstructor() {
		return CourseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		CourseInstructor = courseInstructor;
	}
	public String getCourseCategory() {
		return CourseCategory;
	}
	public void setCourseCategory(String courseCategory) {
		CourseCategory = courseCategory;
	}
	
}
