package com.github.hiuchida.kabusapi.client_ex.pushapi;

import com.google.gson.Gson;

import io.swagger.client.JSON;

/**
 * 時価情報Beanクラスに関するユーティリティクラス。
 */
public class BoardBeanUtil {

	/**
	 * 時価情報BeanからJSON文字列を生成する。
	 * 
	 * @param bb 時価情報Bean。
	 * @return JSON文字列。
	 */
	public static String toJsonString(BoardBean bb) {
		JSON json = new JSON();
		Gson gson = json.getGson();
//		Gson gson = new Gson();
		String s = gson.toJson(bb);
		return s;
	}

	private BoardBeanUtil() {
	}

}
