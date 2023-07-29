package com.github.hiuchida.kabusapi.client_ex.model;

import java.util.ArrayList;
import java.util.List;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;

import io.swagger.client.model.RegistSuccess;
import io.swagger.client.model.RequestRegisterSymbols;

public class RegistSuccessEx {

	private List<RegisterSymbolEx> registList = null;

	public RegistSuccessEx(RegistSuccess response) {
		List<RequestRegisterSymbols> list = response.getRegistList();
		if (list != null) {
			registList = new ArrayList<>();
			for (RequestRegisterSymbols item : list) {
				ExchangeCode ec = ExchangeCode.valueOf(item.getExchange());
				RegisterSymbolEx regist = new RegisterSymbolEx(item.getSymbol(), ec);
				registList.add(regist);
			}
		}
	}

	public List<RegisterSymbolEx> getRegistList() {
		return registList;
	}

	public void setRegistList(List<RegisterSymbolEx> registList) {
		this.registList = registList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegistSuccessEx {\n");

		sb.append("    registList: ").append(toIndentedString(registList)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
