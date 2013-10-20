package ors.dice;

/**
 * 6面体サイコロ
 * @author nagashima
 */
public class Dice {
	/** サイコロの面の数 */
	private int face = 6;

	/**
	 * サイコロを1回振ります
	 * @return 出た目の値（1～6）
	 */
	public int role() {
		return (int)(Math.random() * face) + 1;
	}
}
