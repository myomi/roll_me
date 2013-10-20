package works.work000;

import ors.dice.Dice;

/**
 * さいころの動作確認クラス
 * @author sawamura
 */
public class Main000_02 {
	public static void main(String[] args) {
		Dice dice = new Dice();
		System.out.println("さいころの目は" + dice.role() + "です");

		// TODO 問題0-02をやってみよう「さいころを3回振り、結果をコンソールに表示する」
	}
}
