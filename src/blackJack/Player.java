package blackJack;

import java.util.ArrayList;

public class Player {
	String name;
	ArrayList<Card> hands = new ArrayList<Card>();
	int score = 0;
	boolean isBurst = false;

	Player(String playerName) {
		this.name = playerName;
	}
	
	private void drawCard(Desk desk) {
		Card drowCard = desk.drowCard();
		hands.add(drowCard);
		score += hands.get(hands.size() - 1).Point();
		
		System.out.println(name + "の引いたカードは" + drowCard.NumberString() + "です。");
	}

	void initialDraw(Desk desk) {
		drawCard(desk);
		drawCard(desk); //ディーラーの2枚目は不明
		System.out.println(name + "の現在の得点は" + score + "です。");
	}

	void optionalCardDraw(Desk desk) {
		//　ディーラーとユーザーの動作が異なるのでここはオーバーライド出来るようにabstructクラスを作成
		drawCard(desk); 
		System.out.println(name + "の現在の得点は" + score + "です。");
		
		if (score > 21) {
			isBurst = true;
		}
	}
}
