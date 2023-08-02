package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.hiuchida.kabusapi.client_ex.model.RegisterSymbolEx;

public class RegisterApiExWithSleepTest {

	private final RegisterApiExWithSleep api = new RegisterApiExWithSleep();

	@Test
	public void registerPut1Test() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			RegisterSymbolEx body = new RegisterSymbolEx();
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.registerPut(body, X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void registerPut2Test() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			List<RegisterSymbolEx> reqList = new ArrayList<>();
			RegisterSymbolEx body = new RegisterSymbolEx();
			reqList.add(body);
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.registerPut(reqList, X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void unregisterAllPutTest() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.unregisterAllPut(X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void unregisterPut1Test() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			RegisterSymbolEx body = new RegisterSymbolEx();
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.unregisterPut(body, X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

	@Test
	public void unregisterPut2Test() throws Exception {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 9; i++) {
			List<RegisterSymbolEx> reqList = new ArrayList<>();
			RegisterSymbolEx body = new RegisterSymbolEx();
			reqList.add(body);
			String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
			api.unregisterPut(reqList, X_API_KEY);
		}
		long end = System.currentTimeMillis();
		assertTrue((end - start) > 1000);
	}

}
