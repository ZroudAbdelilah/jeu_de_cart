package test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import cardGame.Card;
import cardGame.Game;
import cardGame.Player;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Player player1 = new Player();
		Player player2 = new Player();
		ArrayList<Card> table = new ArrayList<Card>();
		int round = 0;
		System.out.println("==============================");
		System.out.println("Game started");
		System.out.println("==============================");
		System.out.println();
		System.out.println();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Player 1 joined the game!");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Player 2 joined the game!");
		TimeUnit.SECONDS.sleep(1);
		do {
			System.out.println();
			System.out.println();
			System.out.println("==============================");
			System.out.println("---- Round:" + ++round + " started ---");
			System.out.println("==============================");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Player 1 drop card");
			table.add(player1.playCard());
			System.out.println(table.get(0).toString());
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Player 2 drop card");
			table.add(player2.playCard());
			System.out.println(table.get(1).toString());
			TimeUnit.SECONDS.sleep(1);
			System.out.println();
			System.out.println("====== Checking For this Round Winner ======");
			System.out.print(".");
			System.out.print(".");
			System.out.print(".");
			System.out.print(".");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(".");
			TimeUnit.SECONDS.sleep(1);
			if (new Game().roundWinner(table) == 1) {
				System.err.println("Player 1 is the winner");
				player1.setEarnedCards(table.get(0));
			} else if (new Game().roundWinner(table) == 2) {
				System.err.println("Player 2 is the winner");
				player2.setEarnedCards(table.get(1));
			} else {
				System.err.println("Equality! Round Skiped");
			}
			table.clear();
		} while (player1.getCards().size() > 0 && player2.getCards().size() > 0);
		TimeUnit.SECONDS.sleep(1);
		System.out.println("==============================");
		System.out.println("---- Game end! checking for game winner ---");
		System.out.println("==============================");
		System.out.print(".");
		System.out.print(".");
		System.out.print(".");
		System.out.print(".");
		System.out.println(".");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("----------------------");
		System.out.println("----------------------");

		System.out.println("\nPlayer one has " + player1.getEarnedCards().size() + " cards");
		System.out.println("Player two has " + player2.getEarnedCards().size() + " cards");
		System.err.println("=======================");
		if (new Game().playerScore(player1.getEarnedCards()) > new Game().playerScore(player2.getEarnedCards())) {
			System.err.println(
					"\n==== The Winner is player 1 by: " + new Game().playerScore(player1.getEarnedCards()) + " Score");
		} else if (new Game().playerScore(player1.getEarnedCards()) < new Game()
				.playerScore(player2.getEarnedCards())) {
			System.err.println("\n		==== The Winner is player 2 by: "
					+ new Game().playerScore(player2.getEarnedCards()) + " Score");
		} else {
			System.err.println("\n==== it's a tie!");
		}
		System.err.println("\n=======================");
		System.err.println("=======================");
	}
}
