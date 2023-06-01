
public class Student {
	String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    public Student (String firstName, String lastName, int registration, int grade, int year) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.registration = registration;
    	this.grade = grade;
    	this.year = year;   	
    }//constructor
    
    public void printFullName(){ //este es el metodo principal
        System.out.println(this.firstName + " " + this.lastName);
     }//nombre completo
    
    public boolean isApproved(){
        //TODO implement: should return true if grade >= 60
    	if (this.grade >=60) {
    		return true;//ultima condicion que se cumple del metodo.
    	}//if
    	return false;
    }//los que aprobaron 
    
    public int changeYearIfApproved(){
        //TODO implement: the student should advance to the next year if he/she grade is >= 60
        // Make year = year + 1, and print "Congragulations" if the student has been approved
    	if (isApproved()) {
    		year ++;
    		System.out.println("Congratulations!!");
    	}//if
        return year;
    }//los que pasan al siguiente año

	@Override //aqui sobrecargo el metodo en lo que tenemos que realizar para incluir la variante de estudiantes. 
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", grade=" + grade + ", year=" + year + "]";
	}//tostring
    
    
    
}//class estudiantes 
