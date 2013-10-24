package works.work091;

import ors.dice.Dice;

public class Main091_01 {
	public static void main(String[] args) {
		Dice dice = new Dice();
		int value = dice.role();
		int added = add1(value);
		System.out.println("さいころの出目は" + value + "で、＋１した値は" + added + "です。");
	}

	/**
	 * 引数で渡されたさいころの出目＋１の値を返します。
	 * @param value さいころの出目
	 * @return さいころの出目に+1した値
	 */
	public static int add1(int value) {
		// TODO 問題91-01をやってみよう「add1メソッドを作れ！」
		return 0;
	}
}
