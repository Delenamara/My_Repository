	//Высчитывает дистанцию
	class Calculator {
	Point point;
	
	
	Calculator ( Point p){ //конструктор
			point = p;
			}
	
	double getDistance(){
		int x = point.getX();
		int y = point.getY();
		int x0 = point.getX0();
		int y0 = point.getY0();
		
			return ( Math.sqrt((x-x0)*(x-x0)+(y-y0)*(y-y0) ));
			}
		
	
	}
	