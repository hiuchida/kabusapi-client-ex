package com.github.hiuchida.kabusapi.client_ex;

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
	public void authApiExTest() {
		AuthApiEx api = new AuthApiEx(client);
		assertNotNull(api);
	}

	@Test
	public void infoApiExTest() {
		InfoApiEx api = new InfoApiEx(client);
		assertNotNull(api);
	}

	@Test
	public void orderApiExTest() {
		OrderApiEx api = new OrderApiEx(client);
		assertNotNull(api);
	}

	@Test
	public void registerApiExTest() {
		RegisterApiEx api = new RegisterApiEx(client);
		assertNotNull(api);
	}

}
