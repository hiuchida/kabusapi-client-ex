package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AuthApiExWithSleepTest {

	private final AuthApiExWithSleep api = new AuthApiExWithSleep();

	@Test
	public void tokenPostTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			api.tokenPost("xxxxxx");
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

}
