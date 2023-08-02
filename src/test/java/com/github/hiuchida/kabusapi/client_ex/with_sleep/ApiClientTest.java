package com.github.hiuchida.kabusapi.client_ex.with_sleep;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import io.swagger.client.ApiClient;

public class ApiClientTest {

	private static ApiClient client = new ApiClient();

	@BeforeClass
	public static void beforeOnce() {
		client.setBasePath("http://localhost:18080/kabusapi");
	}

	@Test
	public void authApiExWithSleepTest() {
		AuthApiExWithSleep api = new AuthApiExWithSleep(client);
		assertNotNull(api);
	}

	@Test
	public void infoApiExWithSleepTest() {
		InfoApiExWithSleep api = new InfoApiExWithSleep(client);
		assertNotNull(api);
	}

	@Test
	public void orderApiExWithSleepTest() {
		OrderApiExWithSleep api = new OrderApiExWithSleep(client);
		assertNotNull(api);
	}

	@Test
	public void registerApiExWithSleepTest() {
		RegisterApiExWithSleep api = new RegisterApiExWithSleep(client);
		assertNotNull(api);
	}

}
