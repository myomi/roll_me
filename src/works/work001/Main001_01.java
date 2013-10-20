package works.work001;

import ors.dice.Dice;

/**
 * さいころの動作確認クラス
 * @author sawamura
 */
public class Main001_01 {
	public static void main(String[] args) {
		Dice dice = new Dice();
		int value = dice.role();
		System.out.println("さいころの目は" + value + "です");

		// TODO 問題01-01をやってみよう「あと1万回振れ！」
	}
}
