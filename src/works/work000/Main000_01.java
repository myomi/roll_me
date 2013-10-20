package works.work000;

import ors.dice.Dice;

/**
 * さいころの動作確認クラス
 * @author sawamura
 */
public class Main000_01 {
	public static void main(String[] args) {
		// さいころを１つ用意します
		Dice dice = new Dice();
		// さいころを1回振ります
		int value = dice.role();
		// 出た目を表示します
		System.out.println("さいころの目は" + value + "です");
	}
}
