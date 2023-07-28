package com.github.hiuchida.kabusapi.client_ex.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.google.gson.Gson;

public class GsonUtilTest {

	@Test
	public void getGsonTest1() {
		Gson gson = GsonUtil.getGson();
		assertNotNull(gson);
	}

}
