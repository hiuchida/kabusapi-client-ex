package com.github.hiuchida.kabusapi.client_ex.pushapi;

import com.google.gson.Gson;

import io.swagger.client.JSON;

/**
 * PUSH配信された時価情報Beanクラスを生成するファクトリクラス。
 */
public class BoardBeanFactory {

	/**
	 * 受信したメッセージJSONを解析し、時価情報Beanを生成する。
	 * 
	 * @param message 受信したメッセージ。
	 * @return 時価情報Bean。
	 */
	public static BoardBean parseJson(String message) {
		JSON json = new JSON();
		Gson gson = json.getGson();
//		Gson gson = new Gson();
		BoardBean bb = gson.fromJson(message, BoardBean.class);
		return bb;
	}

	private BoardBeanFactory() {
	}

}
