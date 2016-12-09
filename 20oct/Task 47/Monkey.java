//Task 47
	public class Monkey extends Primates{
		
	protected String name;
	private int age;
    private boolean hungry;
    protected String skill; 

    Monkey() {
    }

    Monkey(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    void walk() {
        System.out.println("*step noises*");
    }

    void destinationOfSkill() {
        System.out.println(name + " can " + skill + " to survive and don't die of hunger");
    }

    void eatSomeFood() {
        hungry = false;
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
	