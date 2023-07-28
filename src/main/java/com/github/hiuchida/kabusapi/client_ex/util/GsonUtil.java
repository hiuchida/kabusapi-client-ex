package com.github.hiuchida.kabusapi.client_ex.util;

import com.google.gson.Gson;

import io.swagger.client.JSON;

public class GsonUtil {

	private static JSON json = new JSON();

	/**
	 * OffsetDateTimeに対応したGsonを取得する。
	 * 
	 * @return OffsetDateTimeに対応したGson。
	 */
	public static Gson getGson() {
		Gson gson = json.getGson();
		return gson;
	}

	private GsonUtil() {
	}

}
