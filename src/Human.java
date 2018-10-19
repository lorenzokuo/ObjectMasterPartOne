
public class Human {
	public String name = "no name";
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public Human(String name) {
		this.name = name;
	}
	
	public void attack(Human x) {
		x.health = x.health-3;
		System.out.println(x.name + " has been attacked by " + this.name);
	}
	
	public void display(Human x) {
		System.out.println(this.name + "'s current health is: " + this.health);
	}
}
