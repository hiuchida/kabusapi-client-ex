package com.github.hiuchida.kabusapi.client_ex.pushapi;

import com.github.hiuchida.kabusapi.client_ex.util.GsonUtil;
import com.google.gson.Gson;

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
		Gson gson = GsonUtil.getGson();
		String s = gson.toJson(bb);
		return s;
	}

	private BoardBeanUtil() {
	}

}
