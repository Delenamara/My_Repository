public class MainStudent1{
	
	public static void main(String[] args){
	 Student1 m = new Student1( "Margarita", "Prokhorova", 17, "ITIS", 1 );
		
	 PointsCalculator c = new PointsCalculator (70, 80) ;
		
		
		System.out.println(m.getName());
		System.out.println(m.getSurname());
		System.out.println(m.getAge());
		System.out.println(m.getFaculty());
		System.out.println(m.getCourse());
		System.out.println(m.getAgeUpTo18years());
		System.out.println(m.getYearsUntilFinishingUniversity()); 
		c.calculatingGPA();
		System.out.println(c.getGPA()); 
		
	}
	
}