package com.github.hiuchida.kabusapi.client_ex.model;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;

import io.swagger.client.model.RequestRegisterSymbols;

public class RegisterSymbolEx {

	private String symbol = null;

	private ExchangeCode exchange = null;

	public RegisterSymbolEx() {
	}

	public RegisterSymbolEx(String symbol, ExchangeCode exchange) {
		this.symbol = symbol;
		this.exchange = exchange;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public ExchangeCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeCode exchange) {
		this.exchange = exchange;
	}

	public RequestRegisterSymbols toRequestRegisterSymbols() {
		RequestRegisterSymbols rrs = new RequestRegisterSymbols();
		rrs.setSymbol(symbol);
		rrs.setExchange(exchange != null ? exchange.intValue() : null);
		return rrs;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RegisterSymbolEx {\n");

		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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
