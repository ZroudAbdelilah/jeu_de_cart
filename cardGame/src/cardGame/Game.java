package cardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Game {

	private ArrayList<Card> Cards = new ArrayList<Card>();

	public Game() {
		this.makeNewSet();
	}

	private void shuffleSet() {
		// Shuffle the cards array
		Collections.shuffle(this.Cards);
	}

	public void makeNewSet() {
		Random r = new Random();
		int low = 10;
		int high = 100;
		// make new cards set
		// Grounds
		this.Cards.add(new Ground("blue", "Eau", "ground", 0, 0, 8));
		this.Cards.add(new Ground("red", "Feu", "ground", 0, 0, 10));
		this.Cards.add(new Ground("green", "Air", "ground", 0, 0, 6));
		this.Cards.add(new Ground("white", "Neutre", "ground", 0, 0, 4));
		this.Cards.add(new Ground("black", "terre", "ground", 0, 0, 2));
		// Creatures

		this.Cards.add(new Creature("Cra", "archer", 200, 200, r.nextInt(high - low) + low));
		this.Cards.add(new Creature("Feca", "protector", 150, 150, r.nextInt(high - low) + low));
		this.Cards.add(new Creature("Sacri", "Berserk", 100, 100, r.nextInt(high - low) + low));
		this.Cards.add(new Creature("Sram", "Assassin", 75, 75, r.nextInt(high - low) + low));
		this.Cards.add(new Creature("Xel", "Master of Time", 50, 50, r.nextInt(high - low) + low));

		// Magic sort
		this.Cards.add(new Magic("Hinotama", "magic", 700, 700, 700,
				"Inflicts 700 points of direct Damage to your opponent's life Points"));
		this.Cards.add(new Magic("Lightning Storm", "magic", 700, 700, 500,
				"Inflicts 500 points of direct Damage to your opponent's life Points"));
		this.shuffleSet();
	}

	public ArrayList<Card> getCards() {
		return this.Cards;
	}

	public int roundWinner(ArrayList<Card> table) {
		if (table.get(0).getAttack() > table.get(1).getAttack()) {
			return 1;
		} else if (table.get(0).getAttack() < table.get(1).getAttack()) {
			return 2;
		} else {
			return 3;
		}
	}

	public int playerScore(ArrayList<Card> cards) {
		int socre = 0;
		for (int i = 0; i < cards.size(); i++) {
			socre = +cards.get(i).getScore();
		}
		return socre;
	}

	@Override
	public String toString() {
		return this.Cards.toString();
	}
}
