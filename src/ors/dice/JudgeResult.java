package ors.dice;

/**
 * 勝ち負け判定ゲームの勝敗結果
 * @author kuwata
 *
 */
public class JudgeResult {
	private int value;		// 出目
	private boolean win;	// 勝敗（true:勝ち）

	/**
	 * さいころの出目を取得します
	 * @return さいころの出目
	 */
	public int getValue() {
		return value;
	}

	/**
	 * さいころの出目を設定します
	 * @param value さいころの出目
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * 勝敗結果を取得します
	 * @return true: 勝ち、false: 負け
	 */
	public boolean isWin() {
		return win;
	}

	/**
	 * 勝敗結果を設定します
	 * @param win true: 勝ち、false: 負け
	 */
	public void setWin(boolean win) {
		this.win = win;
	}
}
