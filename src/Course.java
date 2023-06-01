import java.util.ArrayList;

public class Course {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students = new ArrayList<>();
    
    
    public Course(String courseName, String professorName, int year) {
		this.courseName = courseName;
		this.professorName = professorName;
		this.year = year;
	}//constructor

	public void enroll(Student student){
        //TODO add the student to the collection
     }//enroll
	 public void enroll(Student[]students) {
		 for (Student student : students) {
			 enroll(student);
		 }//for
	 }//enroll	
		
     public void unEnroll(Student student){
         //TODO remove this student from the collection
         // Hint: check if that really is this student
    	 if (students.contains(student)) {
    		 students.remove(student);
    	 }//if de unEnroll para students
     }//unEnrol

     public int countStudents(){
         //TODO implement
         return 0;
     }
     
     public int bestGrade(){ //para la calificación más grande y tarea del ejercicio 6 en adelante 
         int max=0;
         for (Student student : students) {
			if (student.grade>max) {
				max = student.grade;
			}//if
		}//foreach
         return max;
     }//bestGrade

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", professorName=" + professorName + ", year=" + year
				+ ", students=" + students + "]";
	}//to string
     
    }//Class course
