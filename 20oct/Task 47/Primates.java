//Task 47
	public class Primates{
		public static void main(String[] args) {
		
		Human h = new Human ("Luckas", 19, "write programs", "United Kingdom");
		Monkey m = new Monkey ("Bobo", 2, "climb trees");
		
		System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getLocation());
		h.destinationOfSkill();
        h.eatSomeFood();
        h.speech();
        System.out.println("As you can see Luckas is pretty bad with jokes");
    }
}
	
		
	
	