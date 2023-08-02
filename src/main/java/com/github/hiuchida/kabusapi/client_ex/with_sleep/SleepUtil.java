package com.github.hiuchida.kabusapi.client_ex.with_sleep;

public class SleepUtil {

	/**
	 * 1秒間に10回の流量制限をかけるためにスリープする。余裕をとって、1000ミリ秒/120ミリ秒=8.33回程度にする。
	 * InterruptedException発生の場合、スリープ時間が足りない可能性があるため、スリープをリトライする。
	 * 
	 * @return true:InterruptedException発生、false:正常終了
	 */
	public static boolean sleep10times() {
		try {
			Thread.sleep(120);
			return false;
		} catch (InterruptedException e) {
			try {
				Thread.sleep(120);
			} catch (InterruptedException e1) {
			}
			return true;
		}
	}

	/**
	 * 1秒間に5回の流量制限をかけるためにスリープする。余裕をとって、1000ミリ秒/240ミリ秒=4.16回程度にする。
	 * InterruptedException発生の場合、スリープ時間が足りない可能性があるため、スリープをリトライする。
	 * 
	 * @return true:InterruptedException発生、false:正常終了
	 */
	public static boolean sleep5times() {
		try {
			Thread.sleep(240);
			return false;
		} catch (InterruptedException e) {
			try {
				Thread.sleep(240);
			} catch (InterruptedException e1) {
			}
			return true;
		}
	}

	private SleepUtil() {
	}

}
