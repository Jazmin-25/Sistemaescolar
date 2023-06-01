
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hugo = new Student("Hugo", "Rojas", 0, 55, 1);
		Student valeria = new Student("Valeria", "Arquieta", 0, 50, 2);
		Student ana = new Student("Ana Paula", "Batiz", 0, 90, 1);
		Student yesenia = new Student("Yesenia", "Gonzalez", 0, 60, 1);
		Student maritere = new Student("Maritere", "Hernandez", 0, 80, 2);
		
		Student[] lista = {
				new Student("Moisés", "Coral", 0, 57, 1),
				new Student("Leslie", "Garcia", 0, 55, 2),
				new Student("Adriana", "Ibarra", 0, 80, 1),
				new Student("Jorge", "Hernandez", 0, 95, 1),
		};
		
		System.out.println(hugo.changeYearIfApproved());
		System.out.println(valeria.changeYearIfApproved());
		System.out.println(maritere.changeYearIfApproved());
		
		
		System.out.println(hugo);
		System.out.println(ana);
		System.out.println(yesenia);
		
		Course java = new Course("Java FullStack", "Amizaday", 2);
		System.out.println(java.countStudents());
		java.enroll(lista);
		java.enroll(hugo); java.enroll(maritere); java.enroll(ana);
		java.enroll(yesenia);
		java.unEnroll(hugo);
		System.out.println(java.countStudents());
		System.out.println(java);
		System.out.println(java.bestGrade());
	}//main
}//clase
