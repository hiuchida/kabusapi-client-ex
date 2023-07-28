package com.github.hiuchida.kabusapi.client_ex.pushapi;

import com.github.hiuchida.kabusapi.client_ex.util.GsonUtil;
import com.google.gson.Gson;

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
		Gson gson = GsonUtil.getGson();
		BoardBean bb = gson.fromJson(message, BoardBean.class);
		return bb;
	}

	private BoardBeanFactory() {
	}

}
