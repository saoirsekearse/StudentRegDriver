package SutdentRegDriver.StudentRegDriver;

import StudentRegAssignment.Course;
import StudentRegAssignment.Student;
import StudentRegAssignment.Subjects;

import org.joda.time.LocalDate;



public class Driver {

   
    
    public static void main(String []args){
    	
    	Student s1 = new Student("Saoirse ", "30/08/1997", 14417498);
    	Student s2 = new Student("James", "4/12/1995", 14312243);
    	Student s3 = new Student("Niamh", "11/09/1996", 14351432);
    	Student s4 = new Student("Barry", "07/05/1996", 14214309);
    	Student s5 = new Student("Sarah", "12/01/1995", 14513287);
    	Student s6 = new Student("Sean", "01/09/1996", 14232589);
        
    	
    	
    	Subjects sub1 = new Subjects("System on Chip");
        Subjects sub2 = new Subjects("Digital Signal Processing");
        Subjects sub3 = new Subjects("Telecomunications");
        Subjects sub4 = new Subjects("Software Engineering");
        Subjects sub5 = new Subjects("Machine Learning");
       
        sub1.addStudent(s1);
        sub1.addStudent(s2);
        sub1.addStudent(s3);
        sub1.addStudent(s4);
        sub1.addStudent(s5);
        sub1.addStudent(s6);
        
        sub2.addStudent(s1);
        sub2.addStudent(s2);
        sub2.addStudent(s3);
        sub2.addStudent(s4);
       
        sub3.addStudent(s1);
        sub3.addStudent(s2);
        sub3.addStudent(s4);
        sub3.addStudent(s5);
        
        sub4.addStudent(s1);
        sub4.addStudent(s2);
        sub4.addStudent(s4);
        sub4.addStudent(s5);
        sub4.addStudent(s6);
        
        sub5.addStudent(s2);
        sub5.addStudent(s3);
        sub5.addStudent(s4);
        sub5.addStudent(s5);
        sub5.addStudent(s6);
        
        Course ECE = new Course("Electronic and Computer Engineering", "BP", new LocalDate(2017,9,05), new LocalDate(2018,5,16));
        
        ECE.addSubject(sub1);
        ECE.addSubject(sub2);
        ECE.addSubject(sub3);
        ECE.addSubject(sub4);
        ECE.addSubject(sub5);
        
       
       System.out.println("Course:\n"); 
       System.out.println(ECE + "\n");
       System.out.println("Subjects in course:\n");
       System.out.println(ECE.getSubjects() + "\n");
       System.out.println("Students Registered:\n"); 
      
        for (Student i : sub1.getStudent()){
            System.out.println("Name: " + i.getName()  + " Email: "+ i.getStudentUsername() + " DOB:" + i.getDOB() + "\n");
        	
        }
    }
}
