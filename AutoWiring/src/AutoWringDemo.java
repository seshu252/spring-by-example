import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutoWringDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWiring.xml");
		
		//byName
		/*Student student = (Student)context.getBean("student");
			System.out.println(student.getJavaBook().bookTitle());*/
		
		//byType
		/*Car car  = (Car)context.getBean("car");
		System.out.println(car.getWheel().getName());*/
		
		//constructor
		College college = (College)context.getBean("college");
		System.out.println(college.getCollegeStudent().getStudentName());
	}
}
