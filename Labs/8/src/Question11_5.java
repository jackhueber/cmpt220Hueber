//Question 11.5
import java.util.Arrays;
public class Question11_5 {

	public static void main(String[] args) {
		Course course = new Course("Class");
        course.addStudent("Jack");
        course.addStudent("Billy");
        course.addStudent("Chris");
        course.addStudent("John");
        course.addStudent("Luke");
        course.addStudent("Gus");
        course.addStudent("Scott");
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Students: " + Arrays.toString(course.getStudents()));
        System.out.println("Student count: " + course.getNumberOfStudents());
    }
}


