package cardGame;

import java.util.*;

public class Player {
	private String name = null;
	private int score = 0;
	private ArrayList<Card> cards = new ArrayList<Card>();
	private ArrayList<Card> earnedCards = new ArrayList<Card>();
	private Game game = new Game();

	public Player() {
		this.takeCards();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public Card playCard() {
		Card playedCard = this.cards.get(0);
		this.cards.remove(0);
		return playedCard;
	}

	public void takeCards() {
		this.cards = game.getCards();
	}

	public ArrayList<Card> getEarnedCards() {
		return earnedCards;
	}

	public void setEarnedCards(Card card) {
		this.earnedCards.add(card);
	}

	@Override
	public String toString() {
		ArrayList<String> data = new ArrayList<String>();
		for (int i = 0; i < data.size(); i++) {
			switch (this.cards.get(i).getType()) {
			case "ground":
				data.add("Type : " + this.cards.get(i).getType() + ", " + "Name : " + this.cards.get(i).getName()
						+ "Score : " + this.cards.get(i).getScore() + ", " + "Life : " + this.cards.get(i).getLife()
						+ ", " + "Attack : " + this.cards.get(i).getAttack());
				break;
			case "magic":
				data.add("Type : " + this.cards.get(i).getType() + ", " + "Name : " + this.cards.get(i).getName()
						+ "Score : " + this.cards.get(i).getScore() + ", " + "Life : " + this.cards.get(i).getLife()
						+ ", " + "Attack : " + this.cards.get(i).getAttack());
				break;

			default:
				data.add("Type : " + this.cards.get(i).getType() + ", " + "Name : " + this.cards.get(i).getName() + ", "
						+ "Score : " + this.cards.get(i).getScore() + ", " + "Life : " + this.cards.get(i).getLife()
						+ ", " + "Attack : " + this.cards.get(i).getAttack());
				break;
			}
		}

		return data.toString();
	}
}
