package cardGame;

public class Magic extends Card {
	private String description;

	public Magic(String name, String type, int score, int life, int attack, String description) {
		this.setDescription(description);
		this.setName(name);
		this.setType(type);
		this.setScore(score);
		this.setLife(life);
		this.setAttack(attack);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {

		return super.toString();
	}
}
