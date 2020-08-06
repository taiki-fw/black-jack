package blackJack;

public class Dealer extends Player {
	private final int DEALER_MINIMUM_SOCRE = 17;
	
	Dealer(String playerName, Desk desk) {
		super(playerName, desk);
		initialDraw(desk);
	}
	
	void initialDraw(Desk desk) {
		System.out.println(name + "の引いたカードは" + drawCard(desk) + "です。");
		drawCard(desk);
		System.out.println(name + "の2枚目のカードは分かりません。");
	}
	
	void optionalCardDraw() {
		if(score < DEALER_MINIMUM_SOCRE) {
			System.out.println(name + "の引いたカードは" + drawCard(desk) + "です。");
		}
		
		if (score > BURST_POINT) {
			isBurst = true;
		}
	}
}
