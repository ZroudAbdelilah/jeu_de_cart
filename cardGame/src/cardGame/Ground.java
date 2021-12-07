package cardGame;

public class Ground extends Card {
	private String color = null;

	public Ground(String color, String name, String type, int score, int life, int attack) {
		this.setColor(color);
		this.setName(name);
		this.setType(type);
		this.setScore(score);
		this.setLife(life);
		this.setAttack(attack);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
