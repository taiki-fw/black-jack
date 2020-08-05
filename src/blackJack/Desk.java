package blackJack;

import java.util.ArrayList;
import java.util.Random;

class Card {
	String mark;
	int no;

	public Card(String mark, int number) {
		// TODO Auto-generated constructor stub
		this.mark = mark;
		this.no = number;
	}

	// 結果を表示する際に利用するメソッド
	String NumberString() {
		String convertNumString = null;
		
		switch (no) {
		case 1:
			convertNumString =  "A";
			break;
		case 11:
			convertNumString =  "J";
			break;
		case 12:
			convertNumString =  "Q";
			break;
		case 13:
			convertNumString =  "K";
			break;
		default:
			convertNumString =  String.valueOf(no);
			break;
		}
		
		return mark + "の" + no;
	}

	// 得点計算をする時に利用するメソッド
	int Point() {
		if (no > 10) {
			return 10;
		}

		return no;
	}
}

public class Desk {
	String[] marks = new String[] { "ハート", "スペード", "クラブ", "ダイヤ" };
	int[] nos = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	ArrayList<Card> cardList;

	Desk() {
		cardList = new ArrayList<Card>();
		
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < nos.length; j++) {
				cardList.add(new Card(marks[i], nos[j]));
			}
		}
	}

	Card drowCard() {
		Random random = new Random();
		int drawNum = random.nextInt(cardList.size());

		Card pickCard = cardList.remove(drawNum);

		return pickCard;
	}
}
