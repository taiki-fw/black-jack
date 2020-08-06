package blackJack;

import java.util.Objects;
import java.util.Scanner;

public class BlackJackGame {
	static Scanner stdin = new Scanner(System.in);
	public static void start() {
		System.out.println("☆★☆★☆★☆★☆★ ブラックジャックへようこそ！ ☆★☆★☆★☆★☆★");
		System.out.println("ゲームを開始します。");
		// 山札の生成
		Desk desk = new Desk();

		Player user = new User("あなた", desk);
		Player dealer = new Dealer("ディーラー", desk);

		String inputString = null;
		System.out.println("あなたの現在の得点は" + user.score + "です。");
		do {
			System.out.println("カードを引きますか？引く場合はYを、引かない場合はNを入力して下さい。");
			inputString = stdin.nextLine();
			if (Objects.equals(inputString, "Y")) {
				user.optionalCardDraw();
				if (user.isBurst) {
					System.out.println("バーストしました。");
					break;
				}
			}
		} while (Objects.equals(inputString, "Y"));
		
		if(!(user.isBurst)) {
			dealer.optionalCardDraw();	
		}

		System.out.println(user.name + "の得点は" + user.score + "です。");
		System.out.println(dealer.name + "の得点は" + dealer.score + "です。");

		if (dealer.isBurst || (user.isBurst == false && user.score > dealer.score)) {
			System.out.println("あなたの勝ちです。");
		}else {
			System.out.println("あなたの負けです。");
		}
	}
}
