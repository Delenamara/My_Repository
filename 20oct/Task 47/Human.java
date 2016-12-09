//Task 47
	public class Human extends Monkey{
	
	private int profession;
	private String location; 
	
	Human(String name, int age, String skill, String location) {
        super(name, age, skill);
        this.profession = profession;
        this.location = location;
    }

    public String getLocation() {
        return location;

    }

    public int getProfession() {
        return profession;
    }

    void walk() {
        System.out.println("I can show you a moon walking! You'll be impressed!");
    }

    void destinationOfSkill() {
        System.out.println(name + " is trying to " + skill + " in order to avoid being kicked out of University");
    }
	
	void speech(){
		System.out.println("Luckas says: Wanna hear a joke? No? ... ");
	}
	
}
