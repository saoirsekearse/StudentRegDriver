package SutdentRegDriver.StudentRegDriver;

import java.util.ArrayList;
import StudentRegAssignment.Course;
import StudentRegAssignment.Student;
import StudentRegAssignment.Subjects;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;



public class Driver {

    static ArrayList<Subjects> ECESubject = new ArrayList<Subjects>();
	static ArrayList<Subjects> CompSciSubject = new ArrayList<Subjects>();
   
	static ArrayList<Student> ECEStudents = new ArrayList<Student>();
    static ArrayList<Student> CompSciStudents = new ArrayList<Student>();
    
    static ArrayList<Student> students = new ArrayList<Student>();
    
    
    
    public static void main(String []args){
    	
    	ECEStudents.add(new Student("Saoirse ","30/08/1997", 14417498));
    	ECEStudents.add(new Student("James", "4/12/1995", 14312243));
    	ECEStudents.add(new Student("Niamh", "11/09/1996", 14351432));
    	CompSciStudents.add(new Student("Barry", "07/05/1996", 14214309));
    	CompSciStudents.add(new Student("Sarah", "12/01/1995", 14513287));
    	CompSciStudents.add(new Student("Sean", "01/09/1996", 14232589));
    	
        students.addAll(ECEStudents);
        students.addAll(CompSciStudents);
        
        ECESubject.add(new Subjects("System on Chip"));
        ECESubject.add(new Subjects("Digital Signal Processing"));
        ECESubject.add(new Subjects("Tellocomunications"));
        CompSciSubject.add(new Subjects("Software Engineering"));
        CompSciSubject.add(new Subjects("Machine Learning"));
        
        Course ECE = new Course("Electronic and Computer Engineering", "BP", new LocalDate(2017,9,05), new LocalDate(2018,5,16));
        ECE.setSubjects(ECESubject);
        
        Course CompSci = new Course("Computer Science", "BCT", new LocalDate(2017,9,05), new LocalDate(2018,5,16));
        CompSci.setSubjects(CompSciSubject);
        
        for(Student student:students){
        	
        	System.out.println("Student details :\n" + student + "\n Course :" + student.getCourse() + "\n Subjects :" + student.getSubjects());
       
        }
        
    }
}
