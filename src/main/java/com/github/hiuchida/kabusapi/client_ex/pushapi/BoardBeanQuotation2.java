package com.github.hiuchida.kabusapi.client_ex.pushapi;

import com.google.gson.annotations.SerializedName;

/**
 * PUSH配信された時価情報の気配数量2本目～10本目。
 */
public class BoardBeanQuotation2 {
	@SerializedName("Price")
	public Double price = null;

	@SerializedName("Qty")
	public Double qty = null;

	public BoardBeanQuotation2() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BoardBeanQuotation2 {\n");
		
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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
