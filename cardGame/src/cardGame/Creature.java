package cardGame;

public class Creature extends Card {

	public Creature(String name, String type, int score, int life, int attack) {
		this.setName(name);
		this.setType(type);
		this.setScore(attack);
		this.setLife(life);
		this.setAttack(attack);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
