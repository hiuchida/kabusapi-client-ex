package com.github.hiuchida.kabusapi.client_ex.with_sleep;

public class SleepUtil {

	/**
	 * 1秒間に10回の流量制限をかけるためにスリープする。余裕をとって、1000ミリ秒/120ミリ秒=8.33回程度にする。
	 * 
	 * @throws InterruptedException 
	 */
	public static void sleep10times() throws InterruptedException {
		Thread.sleep(120);
	}

	/**
	 * 1秒間に5回の流量制限をかけるためにスリープする。余裕をとって、1000ミリ秒/240ミリ秒=4.16回程度にする。
	 * 
	 * @throws InterruptedException 
	 */
	public static void sleep5times() throws InterruptedException {
		Thread.sleep(240);
	}

	private SleepUtil() {
	}

}
