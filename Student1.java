	class Student1{
		String name;
		String surname;
		int age;
		String faculty;
		int course;
		
	
	Student1 ( String name, String surname, int age, String faculty, int course ){ 
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.faculty = faculty;
			this.course = course;
			
			}
			
		String getName(){
			return name;
			}
		
		String getSurname(){
			return surname;
			}
			
		int getAge(){
			return age;
			}
		
		String getFaculty(){
			return faculty;
			}
			
		int getCourse(){
			return course;
		}
		
		int getAgeUpTo18years(){
			return (18 - age);
			}
			
		int getYearsUntilFinishingUniversity(){
			return (4 - course);
		}
				
	}