package cardGame;

import java.util.ArrayList;

public abstract class Card {

	private String name = null;
	private String type = null;
	private int score = 0;
	private int life = 0;
	private int attack = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int socre) {
		this.score = socre;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		ArrayList<String> data = new ArrayList<String>();
		data.add("name: " + this.getName());
		data.add("type: " + this.getType());
		data.add("score: " + this.getScore());
		data.add("Life: " + this.getLife());
		data.add("attack: " + this.getAttack());
		return data.toString();
	}
}
