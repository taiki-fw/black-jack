package blackJack;

public class User extends Player {

	User(String playerName, Desk desk) {
		super(playerName, desk);
		initialDraw(desk);
	}
	
	void initialDraw(Desk desk) {
		System.out.println(name + "の引いたカードは" + drawCard(desk) + "です。");
		System.out.println(name + "の引いたカードは" + drawCard(desk) + "です。");
	}
	
	void optionalCardDraw() {
		System.out.println(name + "の引いたカードは" + drawCard(desk) + "です。");
		System.out.println(name + "の現在の得点は" + score + "です。");
		
		if (score > BURST_POINT) {
			isBurst = true;
		}
	}
}
