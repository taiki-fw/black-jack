package blackJack;

import java.util.Objects;
import java.util.Scanner;

public class BlackJackGame {
	public static void main(String[] str) {
		Scanner stdin = new Scanner(System.in);
		
		// 山札の生成
		Desk desk = new Desk();
		
		Player user = new Player("あなた");
		Player dealer = new Player("ディーラー");
		
		user.initialDraw(desk);
		dealer.initialDraw(desk);
		
		String inputString = null;
		do {
			System.out.println("さらに引きますか？");
			inputString = stdin.nextLine();
			if(Objects.equals(inputString, "Y")) {
				user.optionalCardDraw(desk);	
			}
		} while (Objects.equals(inputString, "Y"));
		
		while (dealer.score < 17) {
			dealer.optionalCardDraw(desk);
		}
		
		System.out.println("User" + user.score);
		System.out.println("Dealer" + dealer.score);
	}
}
