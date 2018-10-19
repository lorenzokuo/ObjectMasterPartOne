
public class HumanTest {

	public static void main(String[] args) {
		Human h1 = new Human("Human One");
		Human h2 = new Human("Human Two");
		h1.attack(h2);
		h1.display(h1);
		h2.display(h2);
	}
}
