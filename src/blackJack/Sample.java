package blackJack;

import java.util.Objects;
import java.util.Scanner;

public class Sample {
	static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] str) {
		String isContinueString = null;
		
		do {
			BlackJackGame.start();
			System.out.println("\nもう一回遊ぶ？遊ぶ場合はYを入力してね。");
			isContinueString = stdin.nextLine();
		} while (Objects.equals(isContinueString, "Y"));
		
		System.out.println("ブラックジャック終了！また遊んでね★");
	}
}
