package snake;

public class Node {
	private int x;
	private int y;
	private int type;
	
	public Node(int x, int y, int type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public Node(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
