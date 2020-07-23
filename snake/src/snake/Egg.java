package snake;

import java.util.Random;

public class Egg {
	Integer score = 1;
	Node location;

	public int getScore() {
		return score;
	}
	public Egg() {
		
	}
	
	public Egg(Node location) {
		this.location = location;
	}

	public void reAssign() {
		Random rand = new Random();
		Node location = new Node(rand.nextInt(600-60), rand.nextInt(600-60),2);
		this.location = location;
	}

	public Node getLocation() {
		return location;
	}
	
	
}
