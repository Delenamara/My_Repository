class PointsCalculator{
	
	private int MathPoints;
	private int EnglishClassPoints;
	private double GPA;
	
	PointsCalculator ( int MathPoints, int EnglishClassPoints ){
		setMathPoints(MathPoints);
		setEnglishClassPoints(EnglishClassPoints);
	}
	
	void calculatingGPA(){
		this.GPA = (MathPoints + EnglishClassPoints)/2;
	}
	
	double getGPA(){
		return this.GPA;
	}
	
	public void setEnglishClassPoints(int EnglishClassPoints){
		this.EnglishClassPoints = EnglishClassPoints;
		
	}
	
	public void setMathPoints(int MathPoints){
		this.MathPoints = MathPoints;
		
	}
}
