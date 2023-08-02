package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SleepUtilTest {

	/**
	 * 理論値は、8回960ミリ秒、9回1080ミリ秒。
	 * 8回でも1000ミリ秒を越える場合があるが、確実に1000ミリ秒を越えるテストを実施する。
	 */
	@Test
	public void sleep10timesTest() throws InterruptedException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			SleepUtil.sleep10times();
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	/**
	 * 理論値は、4回960ミリ秒、5回1200ミリ秒。
	 * 4回では1000ミリ秒未満となる場合があるが、確実に1000ミリ秒を越えるテストを実施する。
	 */
	@Test
	public void sleep5timesTest() throws InterruptedException {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			SleepUtil.sleep5times();
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

}
