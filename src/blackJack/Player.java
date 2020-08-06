package blackJack;

import java.util.ArrayList;

public abstract class Player {
	protected static final int BURST_POINT = 21;
	
	final String name;
	private ArrayList<Card> hands = new ArrayList<Card>();
	int score = 0;
	boolean isBurst = false;
	Desk desk;

	Player(String playerName, Desk desk) {
		this.name = playerName;
		this.desk = desk;
	}

	protected String drawCard(Desk desk) {
		Card drowCard = desk.drowCard();
		hands.add(drowCard);
		score += hands.get(hands.size() - 1).Point();
		
		return drowCard.NumberString();
	}

	abstract void initialDraw(Desk desk);

	abstract void optionalCardDraw();
}
